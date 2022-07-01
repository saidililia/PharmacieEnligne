package com.example.demo.Controllers;


import com.example.demo.model.medicineModel;
import com.example.demo.repository.medRepo;
import com.example.demo.service.medicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@Controller
public class MedController {
    // only the admin is allowed to manage medecines

@Autowired
private medicineService medSer;
@Autowired
private medRepo medRepo;


    @GetMapping("/medicaments")
    public ModelAndView showStock(){
        ModelAndView view =new ModelAndView("medicines");
        List<medicine> list =medRepo.findAll();
        view.addObject("medicines", list);
        return view;
    }

    @GetMapping("/medicaments/addMedicine")
    public ModelAndView add(){
        ModelAndView view = new ModelAndView("addMedicine");
        medicine newMed = new medicine();
        view.addObject("medicine", newMed);
        return view;
    }



    @PostMapping("/medicaments/addMedicine/saveMedicine")
    public String saveMedicine(@ModelAttribute medicine medicine){
        medRepo.save(medicine);
        return "redirect:/medicaments";
    }

    @GetMapping("/showUpdateFormMedicine")
    public ModelAndView showUpdateForm(@RequestParam int medID){
        ModelAndView view =new ModelAndView("addMedicine");
        medicine med = medRepo.findById(medID);
        view.addObject("medicine", med);
        return view;
    }

    @GetMapping("/deleteMedicine")
    public String DeleteItem(@RequestParam int medID){
        medRepo.deleteById(medID);
        return "redirect:/List/addOrder";
    }

}
