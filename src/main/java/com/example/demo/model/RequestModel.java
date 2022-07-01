package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class RequestModel {
    @NotNull
    private String email;
    @NotNull
    private String password;

    public RequestModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public RequestModel() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
