package com.example.demo.Controllers;


import com.example.demo.model.medicineModel;
import com.example.demo.service.medicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;

@Controller
@RestController
@RequestMapping(value = "/admin")
public class MedController {
    // only the admin is allowed to manage medecines

@Autowired
private medicineService medSer;


    @PostMapping("/medicaments/add")
    public medicine add(@RequestBody medicineModel med){
        medSer.add(med);
        return null;
    }
    @GetMapping(value="medicaments/{id}")
    public void delete(){

    }

    @GetMapping(value="medicaments/{id}")
    public medicine display(){

        return null;
    }

}
