package com.example.hotelap.service.room;

import com.example.hotelap.dao.room.RoomDAO;
import com.example.hotelap.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDAO roomDAO;

    @Override
    @Transactional
    public List<Room> getRooms() {
        return roomDAO.getRooms();
    }

    @Override
    @Transactional
    public void saveRoom(Room theRoom) {
        roomDAO.saveRoom(theRoom);
    }

    @Override
    @Transactional
    public Room getRoom(int theId) {
        return roomDAO.getRoom(theId);
    }

    @Override
    @Transactional
    public void deleteRoom(int theId) {
        roomDAO.deleteRoom(theId);

    }

    @Override
    @Transactional
    public List<Room> getAvailableRooms() {
        return roomDAO.getAvailableRooms();
    }

    @Override
    @Transactional
    public List<Room> getActiveRooms() {
        return roomDAO.getActiveRooms();
    }

}
