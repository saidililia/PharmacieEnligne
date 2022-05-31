package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int ID;
   private String firstName;
   private String lastName;
   private Date birthDate;
   private String gender;
   private String email;
   private String password;

    public client(int ID, String firstName, String lastName, Date birthDate, String gender,
                  String email, String password) {

        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public client(String firstName, String lastName, Date birthDate, String gender, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }
}
