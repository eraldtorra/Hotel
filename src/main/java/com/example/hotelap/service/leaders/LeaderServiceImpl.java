package com.example.hotelap.service.leaders;

import com.example.hotelap.entity.Booking;
import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;
import com.example.hotelap.service.booking.BookingService;
import com.example.hotelap.service.guest.GuestService;
import com.example.hotelap.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderServiceImpl implements LeaderService{

    @Autowired
    private RoomService roomService;

    @Autowired
    private GuestService guestService;

    @Autowired
    private BookingService bookingService;


    @Override
    public List<Room> getRoomsActive() {
        return roomService.getActiveRooms();
    }

    @Override
    public List<Room> getRoomsInactive() {
        return roomService.getAvailableRooms();
    }

    @Override
    public List<Guest> getGuestsActive() {
        return guestService.getGuestsActive();
    }

    @Override
    public List<Booking> getBookingsActive() {
        return bookingService.getBookings();
    }

    @Override
    public void deleteBooking(int theId) {
        bookingService.deleteBooking(theId);
    }
}
