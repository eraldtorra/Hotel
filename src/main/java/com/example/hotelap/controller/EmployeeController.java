package com.example.hotelap.controller;

import com.example.hotelap.entity.Employee;
import com.example.hotelap.entity.Guest;
import com.example.hotelap.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    // listRooms
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
       Employee theEmployee = new Employee();

        theModel.addAttribute("employees", theEmployee);

        return "employees-form";
    }

    // saveRoom
    @GetMapping("/list")
    public String listEmployee(Model theModel) {

        // get employee from the service
           List<Employee> theEmployee= employeeService.getEmployee();

        // add the employee to the model
        theModel.addAttribute("employees", theEmployee);

        return "list-employees";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employees") Employee theEmployee) {

        // save the employee
        employeeService.saveEmployee(theEmployee);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employee/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@ModelAttribute("employeeId") int theId,
                                    Model theModel) {

        // get the employee from our service
        Employee theEmployee = employeeService.getEmployee(theId);

        // set employee as a model attribute to pre-populate the form
        theModel.addAttribute("employees", theEmployee);

        // send over to our form
        return "employees-form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@ModelAttribute("employeeId") int theId) {

        // delete the employee
        employeeService.deleteEmployee(theId);

        // redirect to /guest/list
        return "redirect:/employee/list";

    }
}
