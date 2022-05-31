package com.example.demo.Controllers;

import com.example.demo.entity.commande;
import com.example.demo.model.OrderModel;
import com.example.demo.service.commandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private commandService ordSer;

    @PostMapping("/order")
    public void MakeOrd(@RequestBody OrderModel order){
        ordSer.addOrd(order);
    }
    @GetMapping("/order/{id}")
    public void delete(@RequestBody commande order){

    }
}
