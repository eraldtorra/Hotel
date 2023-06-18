package com.example.hotelap.controller;

import com.example.hotelap.entity.Booking;
import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;
import com.example.hotelap.entity.ServiceH;
import com.example.hotelap.help.personal;
import com.example.hotelap.help.time;
import com.example.hotelap.service.booking.BookingService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/booking")
public class BookingController {

      @Autowired
      private BookingService bookingService;


      // listRooms
        @GetMapping("/listRooms")
        public String listRooms(Model theModel) {

            List<Room> theRooms=null;

            // get rooms from the service
         theRooms = bookingService.getRooms();


            // add the rooms to the model
            theModel.addAttribute("rooms", theRooms);

            if (theRooms==null){
                return "redirect:/booking/noRooms";
            }else {
                return "booking-rooms";
            }

        }

        // reserveRoom
        @GetMapping("/rezervo")
        public String rezervoRoom(@ModelAttribute("roomId") int theId) {

            // get rooms
            bookingService.setRoomPrice(theId);

            return "redirect:/booking/listServices";
        }

        // listServices
        @GetMapping("/listServices")
        public String listServices(Model theModel) {

            // get service from the service
            List< ServiceH> theServices = bookingService.getServices();

            // add the services to the model
            theModel.addAttribute("services", theServices);

            return "booking-service";
        }

        // saveService
        @GetMapping("/saveService")
        public String saveService(@ModelAttribute("serviceId") int theId) {

            // get service int
            bookingService.saveService(theId);


            return "redirect:/booking/showFormForAdd";
        }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Guest theGuest = new Guest();

        theModel.addAttribute("guests", theGuest);

        return "guest-form";
    }

    @PostMapping("/saveGuest")
    public String saveGuest(@ModelAttribute("guests") Guest theGuest) {

        // save the guest
        bookingService.saveBooking(theGuest);

        // use a redirect to prevent duplicate submissions
        return "redirect:/booking/checkInAndOut";
    }

    // checkInAndOut
    @GetMapping("/checkInAndOut")
    public String checkInAndOut(Model theModel) {

            time time = new time();

        theModel.addAttribute("time" , time);
        return "Time";
    }

    @PostMapping  ("/saveCheck")
    public String saveCheck(@ModelAttribute("time") time thetime){

        // save the booking
        bookingService.saveCheckInOut(thetime);


        // use a redirect to prevent duplicate submissions
        return "redirect:/booking/end";
    }


    // end
    @GetMapping("/end")
    public String end() {

        return "exit";
    }

    @GetMapping("/noRooms")
    public String noRooms() {

        return "noRooms";
    }

    @GetMapping("/idPersonal")
    public String idPersonal(Model theModel) {

            personal personal = new personal();


            theModel.addAttribute("personal", personal);

        return "guest-form-showIDPersonal";
    }


    @PostMapping("/savePersonal")
    public String savePersonal(@ModelAttribute("personal") personal personal) {

        // save the guest
        bookingService.PersonalID(personal);

        // use a redirect to prevent duplicate submissions
        return "redirect:/booking/showTime";
    }

    @GetMapping("/showTime")
    public String showTime(Model theModel) {

        // get bookings from the service

        List<Booking> theBookings = bookingService.getBookingT();

        // add the bookings to the model
        theModel.addAttribute("bookings", theBookings);

        if (theBookings == null) {
            return "noCheckin";
        }else {

            return "list-booking-guest";
        }
    }

}
