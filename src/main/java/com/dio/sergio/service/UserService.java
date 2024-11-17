package com.dio.sergio.service;

import com.dio.sergio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
