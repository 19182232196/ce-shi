package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUserByusername(@Param("username") String username);

    User checkLogin(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    void insertUser(User user);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getUserCount();

    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    //    List<Map<String, Object>> getAllUserMap();
    @MapKey("id")
    Map<String, Object> getAllUserMap();

    List<User> getUserByLike(@Param("mohu") String mohu);
    void deleteMoveUser(@Param("ids") String ids);
    List<User> getUserList(@Param("tablename") String tablename);
}
