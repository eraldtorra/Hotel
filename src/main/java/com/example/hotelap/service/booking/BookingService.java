package com.example.hotelap.service.booking;

import com.example.hotelap.controller.BookingController;
import com.example.hotelap.entity.Booking;
import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;
import com.example.hotelap.entity.ServiceH;
import com.example.hotelap.help.personal;
import com.example.hotelap.help.time;

import java.util.List;

public interface BookingService {


    public List<Room> getRooms();


    public void setRoomPrice(int roomID);

    public List<ServiceH> getServices();

    public void saveService(int serviceID);

    public void saveBooking(Guest guest);

    public void saveCheckInOut(time thetime);

    public void saveBooking(Booking booking);

    public void deleteBooking(int theId);

    public List<Booking> getBookings();

    public List<Booking> getBookingPersonal(List<Integer> idGuest);

    public void PersonalID(personal thePersonal);

    public List<Integer> getGuestID(String personalID);

    public List<Booking> getBookingT();




}
