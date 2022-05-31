package com.example.demo.Controllers;

import com.example.demo.entity.client;
import com.example.demo.model.RequestModel;
import com.example.demo.model.clientRegistration;
import com.example.demo.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class clientController {
    // all user are allowed to make an order
    @Autowired
    private clientService clientService;

    @PostMapping("client/register")
    public void register(@RequestBody clientRegistration user){
       clientService.register(user);
    }

    @PostMapping("client/authenticate")
    public void authenticate(@RequestBody RequestModel auth){
        clientService.verify(auth);

    }
}
