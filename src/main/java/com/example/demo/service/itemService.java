package com.example.demo.service;

import com.example.demo.entity.commande;
import com.example.demo.entity.item;
import com.example.demo.entity.medicine;
import com.example.demo.model.itemModel;
import com.example.demo.repository.comRepo;
import com.example.demo.repository.itemRepo;
import com.example.demo.repository.medRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class itemService {
    @Autowired
    private itemRepo itemRepo;
    @Autowired
    private medRepo medRepo;
    @Autowired
    private comRepo comRepo;


    public void deleteItemFromCart(){}
    public void AlterItem(){}
}
