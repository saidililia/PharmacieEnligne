package com.example.demo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Component
@Entity
public class commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private Date dateC;
    private int IDm;
    private int IDc;

    public commande(int ID, Date dateC, int IDm, int IDc) {
        this.ID = ID;
        this.dateC = dateC;
        this.IDm = IDm;
        this.IDc = IDc;
    }

    public commande() {
    }

    public Date getDateC() {
        return dateC;
    }

    public void setDateC(Date dateC) {
        this.dateC = dateC;
    }

    public int getIDm() {
        return IDm;
    }

    public void setIDm(int IDm) {
        this.IDm = IDm;
    }

    public int getIDc() {
        return IDc;
    }

    public void setIDc(int IDc) {
        this.IDc = IDc;
    }

    public commande(Date dateC, int IDm, int IDc) {
        this.dateC = dateC;
        this.IDm = IDm;
        this.IDc = IDc;
    }
}
