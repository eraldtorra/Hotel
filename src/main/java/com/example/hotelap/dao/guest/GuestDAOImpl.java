package com.example.hotelap.dao.guest;

import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class GuestDAOImpl implements GuestDAO{


    @Autowired
    private SessionFactory sessionFactory;



    @Override
    @Transactional
    public List<Guest> getGuest() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query for the guest

        Query<Guest> theQuery =
                currentSession.createQuery("from guests order by guestLastName", Guest.class);

        // execute query and get result list
        List<Guest> guests = theQuery.getResultList();

        return guests;

    }

    @Override
    @Transactional
    public void saveGuest(Guest theGuest) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/upate the guest
        currentSession.saveOrUpdate(theGuest);

    }

    @Override
    public Guest getGuest(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Guest theGuest = currentSession.get(Guest.class, theId);


        return theGuest;
    }

    @Override
    public void deleteGuest(int theId) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
   /*
        Query theQuery =
                currentSession.createQuery("delete from guests where guest_id=:guestId");
        theQuery.setParameter("guestId", theId);

        theQuery.executeUpdate();

        */

        Guest guest = currentSession.get(Guest.class, theId);

        currentSession.delete(guest);


    }

    @Override
    @Transactional
    public List<Guest> getGuestActive() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query for the guest

Query<Guest> theQuery =
                currentSession.createSQLQuery("select * from guests where guest_id in (select guest_id from bookings )").addEntity(Guest.class);

        // execute query and get result list
        List<Guest> guests = theQuery.getResultList();


        return guests;
    }

    @Override
    @Transactional
    public List<Integer> getIDPersonal(String IdPersonal) {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query for the guest
        Query <Integer> theQuery =
                currentSession.createSQLQuery("select guest_id from guests where idpersonal = :IdPersonal").setParameter("IdPersonal", IdPersonal);

        // execute query and get result list
        List<Integer> guests = theQuery.getResultList();

        return guests;

    }
}
