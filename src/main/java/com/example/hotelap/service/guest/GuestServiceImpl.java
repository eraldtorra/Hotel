package com.example.hotelap.service.guest;

import com.example.hotelap.dao.guest.GuestDAO;
import com.example.hotelap.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService{

    @Autowired
    private GuestDAO guestDAO;

    @Override
    @Transactional
    public List<Guest> getGuest() {
        return guestDAO.getGuest() ;
    }

    @Override
    @Transactional
    public void saveGuest(Guest theGuest) {
        guestDAO.saveGuest(theGuest);
    }

    @Override
    @Transactional
    public Guest getGuest(int theId) {
        return guestDAO.getGuest(theId);
    }

    @Override
    @Transactional
    public void deleteGuest(int theId) {
        guestDAO.deleteGuest(theId);
    }

    @Override
    @Transactional
    public List<Guest> getGuestsActive() {
        return guestDAO.getGuestActive();
    }

    @Override
    @Transactional
    public List<Integer> getIDPersonal(String IdPersonal) {
        return guestDAO.getIDPersonal(IdPersonal);
    }

}
