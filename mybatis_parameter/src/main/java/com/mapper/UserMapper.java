package com.mapper;

import com.pojo.User;

import java.util.Map;

public interface UserMapper {
    User getUserByusername(String username);
    User checkLogin(String username, String password);
    User checkLoginByMap(Map<String, Object> map);
}
