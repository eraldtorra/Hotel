package com.example.hotelap.dao.booking;

import com.example.hotelap.entity.Booking;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Access;
import java.util.List;

@Repository
public class BookingDAOImpl implements BookingDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void saveBooking(Booking booking) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/upate the guest
        currentSession.saveOrUpdate(booking);

    }

    @Override
    @Transactional
    public void deleteBooking(int theId) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // delete object with primary key
        Booking booking = currentSession.get(Booking.class, theId);

        currentSession.delete(booking);

    }

    @Override
    @Transactional
    public List<Booking> getBooking() {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        List<Booking> booking = currentSession.createQuery("from bookings", Booking.class).getResultList();

        // execute query and get result list




        return booking;
    }

    @Override
    @Transactional
    public List<Booking> getBookingPersonal(List<Integer> idGuest) {

        List<Booking> booking = null;

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        for (int a : idGuest) {

            Query<Booking> theQuery =
                    currentSession.createSQLQuery("select * from bookings where guest_id = " + a ).addEntity(Booking.class);

            booking = theQuery.getResultList();

            }

        return booking;
    }
}
