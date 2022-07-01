package com.example.demo.service;

import com.example.demo.entity.client;
import com.example.demo.entity.commande;
import com.example.demo.model.OrderModel;
//import com.example.demo.repository.OrdRepo;
//import com.example.demo.repository.OrdRepo;
import com.example.demo.repository.clientRepo;
import com.example.demo.repository.comRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
@Service
public class commandService {
    @Autowired
    private comRepo comRepo;
    @Autowired
    private clientRepo clientRepo;

    public int  createCommande(OrderModel ord){
      client  c = clientRepo.findById(ord.getIDc());
        //commande comm = new commande (c, ord.getDateC());
       //comRepo.save(comm);
         return 0;
    }


}
