package comTest;

import com.mapper.UserMapper;
import com.pojo.User;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
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
}
