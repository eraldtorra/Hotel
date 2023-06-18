package com.example.hotelap.dao.employee;

import com.example.hotelap.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<Employee> getEmployee() {
         // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Employee> theQuery =
                currentSession.createQuery("from employees order by employeeLastName", Employee.class);

        // enter in List
        List<Employee> theEmployees = theQuery.getResultList();

        // execute query and get result list
        return theEmployees;
    }

    @Override
    @Transactional
    public void saveEmployee(Employee theEmployee) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/upate the guest
        currentSession.saveOrUpdate(theEmployee);

    }

    @Override
    @Transactional
    public Employee getEmployee(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Employee theEmployee = currentSession.get(Employee.class, theId);


        return theEmployee;
    }

    @Override
    public void deleteEmployee(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery("delete from employees where employee_id=:employeeId");
        theQuery.setParameter("employeeId", theId);

        theQuery.executeUpdate();

    }
}
