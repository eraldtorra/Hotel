package com.example.hotelap.entity;

import javax.persistence.*;

import java.util.List;

@Entity(name = "guests")
@Table(name = "guests")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guest_id")
    private int guestID;

    @Column(name = "first_name")
    private String guestFirstName;

    @Column(name = "last_name")
    private String guestLastName;


    @Column(name = "idpersonal", unique = true)
    private String idPersonal;

    @Column(name = "phone")
    private String guestPhone;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "guest", cascade = CascadeType.ALL, targetEntity = Booking.class)
    private Booking bookings;




    public Guest() {
    }

    public Guest(String guestFirstName, String guestLastName, String idPersonal, String guestPhone) {
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
        this.idPersonal = idPersonal;
        this.guestPhone = guestPhone;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getGuestPhone() {
        return guestPhone;
    }

    public void setGuestPhone(String guestPhone) {
        this.guestPhone = guestPhone;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestID=" + guestID +
                ", guestFirstName='" + guestFirstName + '\'' +
                ", guestLastName='" + guestLastName + '\'' +
                ", idPersonal='" + idPersonal + '\'' +
                ", guestPhone='" + guestPhone + '\'' +
                '}';
    }
}
