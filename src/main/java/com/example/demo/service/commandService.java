package com.example.demo.service;

import com.example.demo.entity.commande;
import com.example.demo.model.OrderModel;
//import com.example.demo.repository.OrdRepo;
//import com.example.demo.repository.OrdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class commandService {



    public void addOrd(OrderModel order) {
        commande comm = new commande(order.getDateC(), order.getIDc(), order.getIDm());
       // OrdRepo.save(comm);
    }
}
