package com.geekster.ecommerce.services;

import com.geekster.ecommerce.models.User;
import com.geekster.ecommerce.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    @Autowired
    IUserRepo userDao;

    public void createUser(User user) {
        userDao.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userDao.findAll();
    }

    public Optional<User> getUserById(Integer userId) {
        return userDao.findById(userId);
    }

}
