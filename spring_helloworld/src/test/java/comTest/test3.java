package comTest;

import com.alibaba.druid.pool.DruidDataSource;
import com.until.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class test3 {

    @Test
    public void testIOC() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);
        System.out.println(dataSource.getConnection());
    }
    @Test
    public void testIOC2() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Student student1 = ioc.getBean(Student.class);
        Student student2 = ioc.getBean(Student.class);
        System.out.println(student1 == student2);
    }
}
