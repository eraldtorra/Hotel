package com.example.hotelap.controller;

import com.example.hotelap.entity.Booking;
import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;
import com.example.hotelap.service.leaders.LeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/leaders")
public class leaderController {

    @Autowired
    private LeaderService leaderService;


    @GetMapping("/listRoomActive")
    public String listRoomsActive(Model theModel) {

        List<Room> theRooms = leaderService.getRoomsActive();

        theModel.addAttribute("rooms", theRooms);

        return "list-rooms-led";
    }

    @GetMapping("/listRoomInactive")
    public String listRoomsInactive(Model theModel) {

        List<Room> theRooms = leaderService.getRoomsInactive();

        theModel.addAttribute("rooms", theRooms);

        return "list-rooms-led";
    }

    @GetMapping("/listGuestActive")
    public String listGuestsActive(Model theModel) {

        List<Guest> theGuests = leaderService.getGuestsActive();


        theModel.addAttribute("guests", theGuests);

        return "list-guests-led";
    }


    @GetMapping("/listBookingActive")
    public String listBookingsActive(Model theModel) {

        List<Booking> theBookings = leaderService.getBookingsActive();

        theModel.addAttribute("bookings", theBookings);

        return "list-booking-led";
    }

    @GetMapping("/deleteBooking")
    public String deleteBooking(@ModelAttribute("bookingId") int theId) {

        leaderService.deleteBooking(theId);

        return "redirect:/leaders/listBookingActive";
    }


}
