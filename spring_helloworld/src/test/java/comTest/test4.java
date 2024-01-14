package comTest;

import com.until.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.MultiDoc;

public class test4 {
    @Test
    public void testBeanScope(){
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        User user1 = ioc.getBean(User.class);
        System.out.println(user1);
        ioc.close();
    }
}
