package com.gabija.food.ordering.repository;

import com.gabija.food.ordering.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
