package com.example.hotelap.service.employee;

import com.example.hotelap.dao.employee.EmployeeDAO;
import com.example.hotelap.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getEmployee() {
        return employeeDAO.getEmployee() ;
    }

    @Override
    @Transactional
    public void saveEmployee(Employee theEmployee) {
        employeeDAO.saveEmployee(theEmployee);

    }

    @Override
    @Transactional
    public Employee getEmployee(int theId) {
        return employeeDAO.getEmployee(theId);
    }

    @Override
    @Transactional
    public void deleteEmployee(int theId) {
        employeeDAO.deleteEmployee(theId);

    }
}
