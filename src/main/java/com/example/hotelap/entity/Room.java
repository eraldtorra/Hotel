package com.example.hotelap.entity;

import javax.persistence.*;

@Entity(name = "rooms")
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private int roomID;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "price")
    private double roomPrice;

    @Column(name = "capacity")
    private int capacity;

  // mapping






    public Room() {
    }

    public Room(String roomType, double roomPrice, int capacity) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.capacity = capacity;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", roomType='" + roomType + '\'' +
                ", roomPrice='" + roomPrice + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
