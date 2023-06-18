package com.example.hotelap.dao.guest;

import com.example.hotelap.entity.Guest;
import com.example.hotelap.entity.Room;

import java.util.List;

public interface GuestDAO {

    public List<Guest> getGuest();

    public void saveGuest(Guest theGuest);

    public Guest getGuest(int theId);

    public void deleteGuest(int theId);

    public List<Guest> getGuestActive();

    public List<Integer> getIDPersonal(String IdPersonal);

}
