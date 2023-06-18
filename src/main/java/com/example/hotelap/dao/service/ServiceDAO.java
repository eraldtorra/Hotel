package com.example.hotelap.dao.service;


import com.example.hotelap.entity.ServiceH;

import java.util.List;

public interface ServiceDAO {
    public List<ServiceH> getService();

    public void saveService(ServiceH theService);

    public ServiceH getService(int theId);

    public void deleteService(int theId);
}
