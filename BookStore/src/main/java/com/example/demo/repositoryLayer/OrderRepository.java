package com.example.demo.repositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.OrderItem;

@Repository
public interface OrderRepository extends JpaRepository<OrderItem, Long> {
}
