package comTest;

import com.until.Clazz;
import com.until.Person;
import com.until.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    @Test
    public void testIOC(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student studentQ = (Student) ioc.getBean("studentOne");
//        Student studentQ =ioc.getBean(Student.class);
//        Student studentQ = ioc.getBean("studentOne", Student.class);
        Person person = ioc.getBean(Person.class);
        System.out.println(person);
    }
    @Test
    public void testDI(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = ioc.getBean("studentTwo",Student.class);
        Student student = ioc.getBean("studentSix",Student.class);
        System.out.println(student);
/*        Clazz clazz = ioc.getBean("clazzOne",Clazz.class);
        System.out.println(clazz);*/
    }
}