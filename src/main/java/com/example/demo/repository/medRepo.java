package com.example.demo.repository;

import com.example.demo.entity.medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface medRepo extends JpaRepository<medicine, Integer> {

    medicine findById(int ID);

    Optional<medicine> findByName(String name);

    @Query(value = "select m.stock from medicaments where m.name =:name", nativeQuery = true)
    Optional<medicine> findStockByName(String name);
}
