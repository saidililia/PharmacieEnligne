package com.example.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Component
@Data
@Entity
@Table(name = "commande")
public class commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private client client;

    @OneToMany(mappedBy = "commande")
    private Set<item> items = new HashSet<>();

    private String dateC;
    @Transient
    private int itemNum;
    @Transient
    private Double totalPrice;



    public Double getTotalPrice() {
        double sum= 0.0;
        for(item itm: this.items){
            sum= sum + itm.getQuantity()*itm.getMedicine().getPrix();
        }

        return sum;
    }

    public Set<item> getItems() {
        return items;
    }

    public void setItems(Set<item> items) {
        this.items = items;
    }

    public commande() {
    }



    public int getItemNum(){
        int sum=0;
        for(item itm: this.items){
            sum= sum + itm.getQuantity();
        }
        return sum;
    }



}
