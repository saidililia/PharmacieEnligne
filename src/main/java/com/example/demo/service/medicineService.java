package com.example.demo.service;

import com.example.demo.entity.medicine;
import com.example.demo.model.medicineModel;
//import com.example.demo.repository.medRepo;
import com.example.demo.repository.medRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class medicineService {
    @Autowired
    private medRepo medRepo;

    public void add(medicineModel med) {
        medicine Med = new medicine(med.getName(), med.getExpDate(), med.getPrix(), med.getStock());

        medRepo.save(Med);
    }

}
