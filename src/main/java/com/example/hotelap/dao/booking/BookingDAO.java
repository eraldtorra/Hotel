package com.example.hotelap.dao.booking;

import com.example.hotelap.entity.Booking;

import java.util.List;

public interface BookingDAO {

    public void saveBooking(Booking booking);

    public void deleteBooking(int theId);

    public List<Booking> getBooking();

    public List<Booking> getBookingPersonal(List<Integer> idGuest);

}
