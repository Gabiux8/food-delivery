package com.gabija.food.ordering.controller;

import com.gabija.food.ordering.model.Restaurant;
import com.gabija.food.ordering.model.User;
import com.gabija.food.ordering.request.CreateRestaurantRequest;
import com.gabija.food.ordering.service.RestaurantService;
import com.gabija.food.ordering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/restaurants")
public class AdminRestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody CreateRestaurantRequest req, @RequestHeader("Authorization") String jwt) throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        Restaurant restaurant=restaurantService.createRestaurant(req, user);
        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<Restaurant> updateRestaurant(@RequestBody CreateRestaurantRequest req, @RequestHeader("Authorization") String jwt) throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        Restaurant restaurant=restaurantService.createRestaurant(req, user);
        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
    }
}
