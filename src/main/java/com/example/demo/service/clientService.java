package com.example.demo.service;

import com.example.demo.entity.client;

import com.example.demo.model.RequestModel;
import com.example.demo.model.clientRegistration;
import com.example.demo.repository.clientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class clientService {
	
    @Autowired
    private clientRepo clientRepo;

    public void register(clientRegistration user){
        client c= new client(user.getFirstName(),
                             user.getLastName(),
                             user.getBirthDate(),
                             user.getEmail(),
                             user.getPassword());
        clientRepo.save(c);
    }




}
