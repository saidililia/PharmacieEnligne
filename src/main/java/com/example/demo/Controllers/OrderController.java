package com.example.demo.Controllers;

import com.example.demo.entity.commande;
import com.example.demo.entity.item;
import com.example.demo.entity.medicine;
import com.example.demo.model.OrderModel;
import com.example.demo.model.itemModel;
import com.example.demo.repository.comRepo;
import com.example.demo.repository.itemRepo;
import com.example.demo.service.commandService;
import com.example.demo.service.itemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Set;

@RestController
@Controller
public class OrderController {
@Autowired
private commandService commandService;
@Autowired
private itemService itemService;
@Autowired
private comRepo comRepo;
@Autowired
private com.example.demo.repository.itemRepo itemRepo;

    @GetMapping("/List")
    public ModelAndView showOrdersList() {
        ModelAndView view =new ModelAndView("Orders");
        List<commande> list =comRepo.findAll();
        view.addObject("Orders", list);
        return view;
    }
    @GetMapping("/List/addOrder")
    public ModelAndView add(){
        ModelAndView view = new ModelAndView("OrderItems");
        List<item> List = itemRepo.findAll();
        view.addObject("item", List);
        return view;
    }

    @GetMapping("List/addOrder/addItem")
    public ModelAndView addItem(){
        ModelAndView view = new ModelAndView("addItem");
        item item = new item();
        view.addObject("item", item);
        return view;
    }

    @PostMapping("/List/addOrder/addItem/saveItem")
    public String saveItem(@ModelAttribute item item){
        itemRepo.save(item);
        return "redirect:/List/addOrder";
    }


    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam int itemID){
        ModelAndView view =new ModelAndView("addItem");
        item itm = itemRepo.findById(itemID).get();
        view.addObject("item", itm);
        return view;
    }

    @GetMapping("/deleteItem")
    public String DeleteItem(@RequestParam int itemID){
        itemRepo.deleteById(itemID);
        return "redirect:/List/addOrder";
    }

    @GetMapping("/showOrderDetails")
    public ModelAndView showOrderDetails(@RequestParam int ordID){
        ModelAndView view =new ModelAndView("OrderItemsPre");
        Set<item> items = comRepo.getById(ordID).getItems();
       // List<item> items = itemRepo.findAll();
        view.addObject("list", items);
        return view;
    }
}
