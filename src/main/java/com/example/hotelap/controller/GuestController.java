package com.example.hotelap.controller;

import com.example.hotelap.entity.Guest;

import com.example.hotelap.service.guest.GuestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
   private GuestService guestService;


    // listRooms
   @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
       Guest theGuest = new Guest();

        theModel.addAttribute("guests", theGuest);

        return "guest-form";
    }

    // saveRoom
    @GetMapping("/list")
    public String listGuests(Model theModel) {

        // get guest from the service
        List<Guest> theGuest= guestService.getGuest();

        // add the guests to the model
        theModel.addAttribute("guests", theGuest);

        return "list-guests";
    }

    @PostMapping("/saveGuest")
    public String saveGuest(@ModelAttribute("guests") Guest theGuest) {

        // save the guest
        guestService.saveGuest(theGuest);

        // use a redirect to prevent duplicate submissions
        return "redirect:/guest/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@ModelAttribute("guestId") int theId,
                                    Model theModel) {

        // get the guest from our service
        Guest theGuest = guestService.getGuest(theId);

        // set guest as a model attribute to pre-populate the form
        theModel.addAttribute("guests", theGuest);

        // send over to our form
        return "guest-form";
    }

    @GetMapping("/delete")
    public String deleteGuest(@ModelAttribute("guestId") int theId) {

        // delete the guests
        guestService.deleteGuest(theId);

        // redirect to /guest/list
        return "redirect:/guest/list";

    }


}
