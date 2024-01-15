package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {
    @Autowired
//    @Qualifier("userDaoImpl")
    private UserDao userDao;
    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
