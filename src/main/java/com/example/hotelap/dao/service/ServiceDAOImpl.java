package com.example.hotelap.dao.service;


import com.example.hotelap.entity.ServiceH;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ServiceDAOImpl implements ServiceDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<ServiceH> getService() {
         // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<ServiceH> theQuery =
                currentSession.createQuery("from service order by serviceName", ServiceH.class);

        // enter in List
        List<ServiceH> theService= theQuery.getResultList();

        // execute query and get result list
        return theService;
    }

    @Override
    @Transactional
    public void saveService(ServiceH theService) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/upate the service
        currentSession.saveOrUpdate(theService);

    }

    @Override
    @Transactional
    public ServiceH getService(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
       ServiceH theService = currentSession.get(ServiceH.class, theId);


        return theService;
    }

    @Override
    public void deleteService(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery("delete from service where service_id=:serviceId");
        theQuery.setParameter("serviceId", theId);

        theQuery.executeUpdate();

    }
}
