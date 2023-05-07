package com.geekster.ecommerce.repositories;

import com.geekster.ecommerce.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
