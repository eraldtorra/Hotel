package com.example.hotelap.controller;

import com.example.hotelap.entity.Employee;
import com.example.hotelap.entity.ServiceH;
import com.example.hotelap.service.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;


    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        ServiceH theService = new ServiceH();

        theModel.addAttribute("service", theService);

        return "service-form";
    }


    @GetMapping("/list")
    public String listService(Model theModel) {

        // get service from the service
        List<ServiceH> theService = serviceService.getService();

        // add the employee to the model
        theModel.addAttribute("service", theService);

        return "list-service";
    }

    @PostMapping("/saveService")
    public String saveService(@ModelAttribute("service") ServiceH theService) {

        // save the service
        serviceService.saveService(theService);

        // use a redirect to prevent duplicate submissions
        return "redirect:/service/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@ModelAttribute("serviceId") int theId,
                                    Model theModel) {

        // get the service from our service
        ServiceH theService = serviceService.getService(theId);

        // set service as a model attribute to pre-populate the form
        theModel.addAttribute("service", theService);

        // send over to our form
        return "service-form";
    }

    @GetMapping("/delete")
    public String deleteService(@ModelAttribute("serviceId") int theId) {

        // delete the service
        serviceService.deleteService(theId);

        // redirect to /guest/list
        return "redirect:/service/list";

    }

}
