package com.example.hotelap.dao.employee;

import com.example.hotelap.entity.Employee;
import com.example.hotelap.entity.Guest;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getEmployee();

    public void saveEmployee(Employee theEmployee);

    public Employee getEmployee(int theId);

    public void deleteEmployee(int theId);
}
