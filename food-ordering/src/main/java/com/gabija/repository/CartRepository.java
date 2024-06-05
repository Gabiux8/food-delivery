package com.gabija.food.ordering.repository;

import com.gabija.food.ordering.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
