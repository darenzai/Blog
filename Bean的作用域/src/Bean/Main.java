package Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        person p= (person) context.getBean("person");
        p.setName("胡佳艺");
        System.out.println(p.getName());
        person p1= (person) context.getBean("person");
        System.out.println(p1.getName());

    }
}
