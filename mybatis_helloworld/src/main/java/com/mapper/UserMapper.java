package com.mapper;

import com.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();
    void updateUser();
    void deleteUser();
    User getUserById();
    List<User> getAllUsers();
}
