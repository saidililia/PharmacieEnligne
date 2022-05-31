package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "medicaments")
public class medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String name;
    private Date expDate;

    public medicine(int ID, String name, Date expDate) {
        this.ID = ID;
        this.name = name;
        this.expDate = expDate;
    }

    public medicine(String name, Date expDate) {
        this.name = name;
        this.expDate = expDate;
    }

    public medicine() {
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
}
