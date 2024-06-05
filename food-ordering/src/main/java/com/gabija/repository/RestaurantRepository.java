package com.gabija.repository;

import com.gabija.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    @Query("SELECT j FROM Restaurant j WHERE lower(j.name) LIKE lower(concat('%', :query, '%'))" + "OR lower(j.cuisineType) LIKE lower(concat('%', :query, '%')) ")
    List<Restaurant> findBySearchQuery(String query);

    Restaurant findByOwnerId(Long userId);
}
