package com.example.demo.Controllers;

import com.example.demo.entity.client;
import com.example.demo.model.RequestModel;
import com.example.demo.repository.clientRepo;
import com.example.demo.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class clientController {
    // all user are allowed to make an order
    @Autowired
    private clientService clientService;
    @Autowired
    private clientRepo clientRepo;


    @GetMapping("/Registration")
    public ModelAndView register(){
       ModelAndView view = new ModelAndView("RegistrationAttempt");
        client client = new client();
        view.addObject("client", client);

        return view;
    }

    @PostMapping("/Registration/saveClient")
    public String saveClient(@ModelAttribute client client){
        client c = clientRepo.findById(client.getID());
        if (c!=null){
            return "redirect:/Login";
        }
        else {
            clientRepo.save(client);
            return "redirect:/List";
        }
    }

    @GetMapping("/Login")
    public ModelAndView authenticate(){
        ModelAndView view = new ModelAndView("authenticationAttemp");
        RequestModel request = new RequestModel();
        view.addObject("request", request);
        return view;
    }

    @PostMapping("/Login/check")
    public String verify(@ModelAttribute RequestModel Request) {
        client c = clientRepo.findByEmail(Request.getEmail());

        if(c == null){
            return "redirect:/Login";
        }
        else if (c.getID() == 1) {
            return "redirect:/medicaments";
        }
        else {
        return "redirect:/List";
        }
        
    }

}
