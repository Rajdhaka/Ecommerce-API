package com.geekster.ecommerce.repositories;

import com.geekster.ecommerce.models.Order;
import org.hibernate.type.descriptor.java.IntegerJavaType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order, Integer> {
}
