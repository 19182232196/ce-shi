package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    //获取SqlSession对象
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        try {
            //获取mybatis-config.xml文件输入流
            InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
            //创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            //创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
            //创建SqlSession对象
            sqlSession=sqlSessionFactory.openSession(true);//自动提交事务
        } catch (IOException e) {
            throw new RuntimeException(e);
        }return sqlSession;
    }
}