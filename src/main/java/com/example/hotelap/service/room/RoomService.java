package com.example.hotelap.service.room;

import com.example.hotelap.entity.Room;

import java.util.List;

public interface RoomService {

        public List<Room> getRooms();

        public void saveRoom(Room theRoom);

        public Room getRoom(int theId);

        public void deleteRoom(int theId);

        public List<Room> getAvailableRooms();

        public List<Room> getActiveRooms();


}
