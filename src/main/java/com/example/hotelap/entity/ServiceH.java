package com.example.hotelap.entity;

import javax.persistence.*;

import java.util.List;

@Entity(name = "service")
@Table(name = "aditionalservices")
public class ServiceH {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private int serviceID;

    @Column(name = "name")
    private String serviceName;

    @Column(name = "price")
    private int servicePrice;




    public ServiceH() {
    }

    public ServiceH(String serviceName, int servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }

}
