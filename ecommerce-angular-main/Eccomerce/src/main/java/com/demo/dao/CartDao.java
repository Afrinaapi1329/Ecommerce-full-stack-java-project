package com.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.entity.Cart;

public interface CartDao extends JpaRepository<Cart, Long>{
	   Optional<Cart> findByName(String name);
	}