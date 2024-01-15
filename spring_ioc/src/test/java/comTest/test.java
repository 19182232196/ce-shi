package comTest;

import com.pojo.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testAutoWireByXML(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-factory.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.saveUser();
    }
}
