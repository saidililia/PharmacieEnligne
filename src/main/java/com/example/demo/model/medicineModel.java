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
    private Date expDate;

    public medicineModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public medicineModel(String name, Date expDate) {
        this.name = name;
        this.expDate = expDate;
    }
}
