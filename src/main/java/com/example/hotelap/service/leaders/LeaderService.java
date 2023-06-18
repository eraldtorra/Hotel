package com.example.hotelap.service.leaders;

import com.example.hotelap.entity.Booking;
import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;

import java.util.List;

public interface LeaderService {


    public List<Room> getRoomsActive();

    public List<Room> getRoomsInactive();

    public List<Guest> getGuestsActive();

    public List<Booking> getBookingsActive();

    public void deleteBooking(int theId);



}
