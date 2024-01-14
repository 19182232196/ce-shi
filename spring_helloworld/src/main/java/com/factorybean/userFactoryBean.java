package com.factorybean;

import com.until.User;
import org.springframework.beans.factory.FactoryBean;

public class userFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
