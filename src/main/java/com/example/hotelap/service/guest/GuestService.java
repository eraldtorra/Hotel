package com.example.hotelap.service.guest;

import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;

import java.util.List;

public interface GuestService {


    public List<Guest> getGuest();

    public void saveGuest(Guest theGuest);

    public Guest getGuest(int theId);

    public void deleteGuest(int theId);

    public List<Guest> getGuestsActive();

    public List<Integer> getIDPersonal(String IdPersonal);
}
