package com.example.bookshop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.bookshop.models.Order;
import com.example.bookshop.models.User;


public interface OrderRepository extends JpaRepository<Order, Long>{
	List<Order> findAllByUser(User user);
}
