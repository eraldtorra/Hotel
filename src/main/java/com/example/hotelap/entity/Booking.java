package com.example.hotelap.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity(name = "bookings")
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int bookingID;

    @Column(name = "check_in")
    private String CheckInDate;

    @Column(name = "check_out")
    private String CheckOutDate;

    @Column(name = "room_id")
    private int Room;

    @Column(name="employee_id")
    private int Employee;

    @Column(name = "service_id")
    private int serviceID;

    @OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "guest_id", referencedColumnName = "guest_id", nullable = false)
    private Guest guest;





    public Booking() {
    }

    public Booking(int bookingID, String checkInDate, String checkOutDate, int room, int employee, int serviceID, Guest guest) {
        this.bookingID = bookingID;
        CheckInDate = checkInDate;
        CheckOutDate = checkOutDate;
        Room = room;
        Employee = employee;
        this.serviceID = serviceID;
        this.guest = guest;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getCheckInDate() {
        return CheckInDate;
    }

    public void setCheckInDate(String checkInDate) {
        CheckInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return CheckOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        CheckOutDate = checkOutDate;
    }

    public int getRoom() {
        return Room;
    }

    public void setRoom(int room) {
        Room = room;
    }

    public int getEmployee() {
        return Employee;
    }

    public void setEmployee(int employee) {
        Employee = employee;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
