import Bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicatonContext.xml");
        Person p= (Person) context.getBean("person");
        System.out.println(p.getSay());
        context.close();
    }
}
