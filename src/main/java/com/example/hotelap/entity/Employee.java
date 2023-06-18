package com.example.hotelap.entity;


import javax.persistence.*;

import java.util.List;

@Entity(name = "employees")
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeID;

    @Column(name = "first_name")
    private String employeeFirstName;

    @Column(name = "last_name")
    private String employeeLastName;

    @Column(name = "email")
    private String employeeEmail;

    @Column(name = "position")
    private String position;

    @Column(name = "phone")
    private String employeePhone;



    public Employee() {
    }

    public Employee(String employeeFirstName, String employeeLastName, String employeeEmail, String position, String employeePhone) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeEmail = employeeEmail;
        this.position = position;
        this.employeePhone = employeePhone;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getPosition() {
        return position;
    }

public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", position='" + position + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                '}';
    }
}
