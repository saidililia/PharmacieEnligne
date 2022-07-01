package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NomMedicament", referencedColumnName = "name")
    private medicine medicine;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commandeId")
    private commande commande;

    private int quantity;

    public com.example.demo.entity.medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(com.example.demo.entity.medicine medicine) {
        this.medicine = medicine;
    }

    public item() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
