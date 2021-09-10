package com.INSmarket.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.INSmarket.user.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, String>{

}
