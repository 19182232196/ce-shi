package comTest;

import com.mapper.UserMapper;
import com.pojo.User;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parameter {
    @Test
    public void testGetUserByusername(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=mapper.getUserByusername("admin");
        System.out.println(user);
    }
    @Test
    public void testGetCheckLogin(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=mapper.checkLogin("admin","123");
        System.out.println(user);
    }
    @Test
    public void testGetCheckLoginByMap(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map=new HashMap<>();
        map.put("username","admin");
        map.put("password","123");
        User user=mapper.checkLoginByMap(map);
        System.out.println(user);
    }
    @Test
    public void testInsertUser(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=new User(null,"root","123",18,"男","123@qq.com");
        mapper.insertUser(user);
    }
    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=mapper.checkLoginByParam("admin","123");
        System.out.println(user);
    }
    @Test
    public void testGetUserById(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=mapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> list=mapper.getAllUser();
        list.forEach(System.out::println);
    }
    @Test
    public void testGetCount(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Integer count=mapper.getUserCount();
        System.out.println(count);
    }
    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map=mapper.getUserByIdToMap(1);
        System.out.println(map);
    }
    @Test
    public void testGetAllUserMap(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
//        List<Map<String, Object>> map=mapper.getAllUserMap();
//        System.out.println(map);
        Map<String, Object> map=mapper.getAllUserMap();
        System.out.println(map);
    }
}
