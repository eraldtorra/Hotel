package com.example.hotelap.service.service;

import com.example.hotelap.dao.service.ServiceDAO;
import com.example.hotelap.entity.ServiceH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService{

    @Autowired
    private ServiceDAO serviceDAO;


    @Override
    @Transactional
    public List<ServiceH> getService() {
        return serviceDAO.getService();
    }

    @Override
    @Transactional
    public void saveService(ServiceH theService) {
        serviceDAO.saveService(theService);
    }

    @Override
    @Transactional
    public ServiceH getService(int theId) {
        return serviceDAO.getService(theId);
    }

    @Override
    @Transactional
    public void deleteService(int theId) {
        serviceDAO.deleteService(theId);
    }
}
