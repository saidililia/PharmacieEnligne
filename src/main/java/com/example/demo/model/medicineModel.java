package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class medicineModel {
    @NotNull
    private String name;
    @NotNull
    private String expDate;
    @NotNull
    private double prix;
    @NotNull
    private int stock;

    public medicineModel() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public medicineModel(String name, String expDate, double prix, int stock) {
        this.name = name;
        this.expDate = expDate;
        this.prix = prix;
        this.stock = stock;
    }
}
