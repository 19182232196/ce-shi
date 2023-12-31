package test;

import com.mapper.UserMapper;
import com.pojo.User;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//获取mybatis-config.xml文件输入流
public class MyBatisTest {
    @Test
    public void testInsert() throws IOException {

        //获取mybatis-config.xml文件输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder
                = new SqlSessionFactoryBuilder();

        //使用输入流创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory =sqlSessionFactoryBuilder.build(is);

/*        //使用SqlSessionFactory对象创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();*/
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

/*        //获取UserMapper对象
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        //调用UserMapper的insertUser方法
        int result = mapper.insertUser();*/
        int  result = sqlSession.insert("com.mapper.UserMapper.insertUser");

        //输出结果
        System.out.println("结果"+result);

/*        //提交事务
        sqlSession.commit();*/

        //关闭SqlSession对象
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void testDelete(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User id=mapper.getUserById();
        System.out.println(id);
    }

    @Test
    public void testGetAllUsers(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> id=mapper.getAllUsers();
        id.forEach(System.out::println);
    }
}
