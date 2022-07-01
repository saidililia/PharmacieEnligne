package com.example.demo.repository;

import com.example.demo.entity.item;
import com.example.demo.model.itemModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface itemRepo extends JpaRepository<item, Integer> {


    @Query("select i from item i")
    public List<item> findByIDOrder(@Param("ordID") int ordID);

}
