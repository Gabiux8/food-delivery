package com.gabija.food.ordering.response;

import com.gabija.food.ordering.model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;

    private String message;

    private USER_ROLE role;

}
