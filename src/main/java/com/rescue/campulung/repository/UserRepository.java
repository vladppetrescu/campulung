package com.rescue.campulung.repository;

import org.springframework.data.repository.CrudRepository;

import com.rescue.campulung.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
