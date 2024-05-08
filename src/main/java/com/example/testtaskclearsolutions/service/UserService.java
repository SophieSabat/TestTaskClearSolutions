package com.example.testtaskclearsolutions.service;

import com.example.testtaskclearsolutions.dto.User;

import java.util.List;

public interface UserService {
    void create(List<User> users, User user);

    void updateSomeFields(Long id, List<User> users, User user);

    void updateAllFields(Long id, List<User> users, User user);

    void delete(Long id, List<User> users);

    void search(List<User> users);
}
