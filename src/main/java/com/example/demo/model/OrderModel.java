package com.example.demo.model;


import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class OrderModel {
    @NotNull
    private Date dateC;
    @NotNull
    private int IDm;
    @NotNull
    private int IDc;

    public OrderModel(Date dateC, int IDm, int IDc) {
        this.dateC = dateC;
        this.IDm = IDm;
        this.IDc = IDc;
    }

    public OrderModel() {
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
}
