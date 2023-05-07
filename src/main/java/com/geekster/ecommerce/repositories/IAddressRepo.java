package com.geekster.ecommerce.repositories;

import com.geekster.ecommerce.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer> {
}
