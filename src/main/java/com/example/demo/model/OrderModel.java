package com.example.demo.model;


import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class OrderModel {
    @NotNull
    private String dateC;
    @NotNull
    private int IDc;

    public OrderModel(String dateC, int IDc) {
        this.dateC = dateC;
        this.IDc = IDc;
    }

    public OrderModel() {
    }

    public String getDateC() {
        return dateC;
    }

    public void setDateC(String dateC) {
        this.dateC = dateC;
    }


    public int getIDc() {
        return IDc;
    }

    public void setIDc(int IDc) {
        this.IDc = IDc;
    }
}
