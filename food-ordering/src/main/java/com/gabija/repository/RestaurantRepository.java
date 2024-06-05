package com.gabija.food.ordering.repository;

import com.gabija.food.ordering.model.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    @Query("SELECT j FROM Restaurant j WHERE lower(j.name) LIKE lower(concat('%', :query, '%'))" + "OR lower(j.cuisineType) LIKE lower(concat('%', :query, '%')) ")
    List<Restaurant> findBySearchQuery(String query);
    Restaurant findByOwnerId(Long userId);
}
