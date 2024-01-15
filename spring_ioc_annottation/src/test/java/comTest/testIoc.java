package comTest;

import com.controller.UserController;
import com.dao.UserDao;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testIoc {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean("controller",UserController.class);
        System.out.println(userController);
/*        UserService service = ioc.getBean(UserService.class);
        System.out.println(service);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(userDao);*/
        userController.saveUser();
    }
}
