package com.dao.impl;

import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
//    @Qualifier("userServiceImpl")
    public void saveUser() {
        System.out.println("dao save user");
    }
}
