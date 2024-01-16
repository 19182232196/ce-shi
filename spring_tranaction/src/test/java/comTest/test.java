package comTest;

import com.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class test {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"asdf","123","21","女","123@qq.com");
    }
    @Test
    public void test2(){
        String sql = "select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(User.class),1);
        System.out.println(user);
    }
    @Test
    public void test3(){
        String sql = "select * from t_user";
        List<User> list = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(User.class));
        list.forEach(System.out::println);
    }
    @Test
    public void test4(){
        String sql = "select count(*) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(count);
    }
}
