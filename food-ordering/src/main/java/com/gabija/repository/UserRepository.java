package com.gabija.food.ordering.repository;

import com.gabija.food.ordering.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
   public User findByEmail(String username);
}
