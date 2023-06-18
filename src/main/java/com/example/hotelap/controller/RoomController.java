package com.example.hotelap.controller;

import com.example.hotelap.entity.Room;
import com.example.hotelap.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;


    // listRooms
   @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Room theRoom = new Room();

        theModel.addAttribute("rooms", theRoom);

        return "room-form";
    }

    // saveRoom
    @GetMapping("/list")
    public String listRooms(Model theModel) {

        // get rooms from the service
        List<Room> theRooms = roomService.getRooms();

        // add the rooms to the model
        theModel.addAttribute("rooms", theRooms);

        return "list-rooms";
    }

    @PostMapping("/saveRoom")
    public String saveRoom(@ModelAttribute("rooms") Room theRoom) {

        // save the room
        roomService.saveRoom(theRoom);

        // use a redirect to prevent duplicate submissions
        return "redirect:/room/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@ModelAttribute("roomId") int theId,
                                    Model theModel) {

        // get the room from our service
        Room theRoom = roomService.getRoom(theId);

        // set room as a model attribute to pre-populate the form
        theModel.addAttribute("rooms", theRoom);

        // send over to our form
        return "room-form";
    }

    @GetMapping("/delete")
    public String deleteRoom(@ModelAttribute("roomId") int theId) {

        // delete the room
        roomService.deleteRoom(theId);

        // redirect to /room/list
        return "redirect:/room/list";

    }

    @GetMapping("/test")
    public List<Room> test() {
        return roomService.getRooms();
    }


}
