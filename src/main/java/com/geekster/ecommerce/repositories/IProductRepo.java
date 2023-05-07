package com.geekster.ecommerce.repositories;

import com.geekster.ecommerce.models.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
    @Query(name = "Select * from Products where category = :category ",nativeQuery = true)
    Iterable<Product> findProductByCategory(String category);
}
