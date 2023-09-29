package com.example.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpa.dto.OrderResponse;
import com.example.jpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

   @Query("SELECT new com.example.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
