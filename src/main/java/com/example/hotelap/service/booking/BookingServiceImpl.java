package com.example.hotelap.service.booking;

import com.example.hotelap.dao.booking.BookingDAO;
import com.example.hotelap.entity.Booking;
import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;
import com.example.hotelap.entity.ServiceH;
import com.example.hotelap.help.personal;
import com.example.hotelap.help.time;
import com.example.hotelap.service.guest.GuestService;
import com.example.hotelap.service.room.RoomService;
import com.example.hotelap.service.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private RoomService roomService;


    @Autowired
    private BookingDAO bookingDAO;

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private GuestService guestService;

    Booking booking = new Booking();

    String personalID;


    @Override
    @Transactional
    public List<Room> getRooms() {
        return roomService.getAvailableRooms();
    }


    @Override
    public void setRoomPrice(int roomID) {
        booking.setRoom(roomID);
    }
    @Override
    public void saveService(int serviceID) {
        booking.setServiceID(serviceID);
    }

    @Override
    public void saveBooking(Guest guest) {
        booking.setGuest(guest);
        booking.setEmployee(1);
    }

    @Override
    public void saveCheckInOut(time thetime) {
        booking.setCheckInDate(thetime.getCheckInDate());
        booking.setCheckOutDate(thetime.getCheckOutDate());

        saveBooking(booking);
    }

    @Override
    @Transactional
    public void saveBooking(Booking booking) {
       bookingDAO.saveBooking(booking);
    }

    @Override
    @Transactional
    public void deleteBooking(int theId) {
        bookingDAO.deleteBooking(theId);
    }

    @Override
    @Transactional
    public List<Booking> getBookings() {
        return bookingDAO.getBooking();
    }

    @Override
    @Transactional
    public List<Booking> getBookingPersonal(List<Integer> idGuest) {

        return bookingDAO.getBookingPersonal(idGuest);
    }


    @Override
    public List<ServiceH> getServices() {
        return serviceService.getService();
    }

    @Override
    public void PersonalID(personal thePersonal) {
        personalID = thePersonal.getPersonalName();
    }

    @Override
    public List<Integer> getGuestID(String personalID) {
        return guestService.getIDPersonal(personalID);
    }

    @Override
    public List<Booking> getBookingT() {

        return getBookingPersonal(getGuestID(personalID)) ;
    }


}
