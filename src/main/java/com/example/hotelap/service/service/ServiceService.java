package com.example.hotelap.service.service;

import com.example.hotelap.entity.ServiceH;

import java.util.List;

public interface ServiceService {

    public List<ServiceH> getService();

    public void saveService(ServiceH theService);

    public ServiceH getService(int theId);

    public void deleteService(int theId);
}


