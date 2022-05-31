package com.example.demo.service;

import com.example.demo.entity.medicine;
import com.example.demo.model.medicineModel;
//import com.example.demo.repository.medRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class medicineService {

    public void add(medicineModel med) {
        medicine Med = new medicine(med.getName(), med.getExpDate());
      //  medRepo.save(Med);
    }
}
