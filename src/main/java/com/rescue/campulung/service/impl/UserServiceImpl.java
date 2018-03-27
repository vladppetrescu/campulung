package com.rescue.campulung.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rescue.campulung.model.User;
import com.rescue.campulung.repository.UserRepository;
import com.rescue.campulung.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User delete(Integer id) {
        User user = findById(id);
        if (user != null) {
            repository.delete(user);
        }
        return user;
    }

    @Override
    public Iterable<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User update(User user) {
        return null;
    }
}