package com.example.hotelap.dao.room;

import com.example.hotelap.entity.Booking;
import com.example.hotelap.entity.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository

public class RoomDAOImpl implements RoomDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Room> getRooms() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
       Query<Room> theQuery =
                    currentSession.createQuery("from rooms order by roomType", Room.class);

        List<Room> rooms = theQuery.getResultList();

    return rooms;

    }

    @Override
    @Transactional
    public void saveRoom(Room theRoom) {

    // get current hibernate session
    Session currentSession = sessionFactory.getCurrentSession();

    // save/upate the customer
    currentSession.saveOrUpdate(theRoom);

    }

    @Override
    @Transactional
    public Room getRoom(int theId) {

   // get the current hibernate session
    Session currentSession = sessionFactory.getCurrentSession();

    // now retrieve/read from database using the primary key
    Room theRoom = currentSession.get(Room.class, theId);

    return theRoom;

    }

    @Override
    @Transactional
    public void deleteRoom(int theId) {

    // get current hibernate session
    Session currentSession = sessionFactory.getCurrentSession();

    // delete object with primary key

    Query theQuery =
            currentSession.createQuery("delete from rooms where room_id=:roomId");
    theQuery.setParameter("roomId", theId);

    theQuery.executeUpdate();

    }

    @Override
    @Transactional
    public List<Room> getAvailableRooms() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
       Query<Room> theQuery =
               currentSession.createSQLQuery("SELECT * FROM rooms WHERE room_id NOT IN (SELECT room_id FROM bookings)").addEntity(Room.class);

        List<Room> rooms = theQuery.getResultList();

        return rooms;
    }

    @Override
    @Transactional
    public List<Room> getActiveRooms() {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
         Query<Room> theQuery =
                currentSession.createSQLQuery("SELECT * FROM rooms WHERE room_id IN (SELECT room_id FROM bookings)").addEntity(Room.class);

        List<Room> rooms = theQuery.getResultList();

        return rooms;
    }

}


