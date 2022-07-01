package com.example.demo.repository;

import com.example.demo.entity.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface clientRepo extends JpaRepository<client, Integer> {
    client findById(int ID);
   // Optional<client> findByEmail(String email);
    client findByEmail(String email);

    //@Query(value = "select c from clients c where c.email=:1 and c.password=:2",nativeQuery = true)
    //public client findByEmailPassword(String email, String password);

}
