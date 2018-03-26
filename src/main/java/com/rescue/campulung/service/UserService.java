package com.rescue.campulung.service;

import com.rescue.campulung.model.User;

public interface UserService {

    public User create(User user);

    public User delete(Integer id);

    public Iterable<User> findAll();

    public User findById(Integer id);

    public User update(User user);
}
