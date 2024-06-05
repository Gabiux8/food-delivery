package com.gabija.food.ordering.service;

import com.gabija.food.ordering.model.User;

public interface UserService {
    public User findUserByJwtToken(String jwt) throws Exception;

    public User findUserByEmail(String email) throws Exception;
}
