import Bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

        Person father=(Person)context.getBean("father");
        System.out.println("父类  :"+father.toString());
        Person son= (Person) context.getBean("son");
        System.out.println("子类  :"+son.toString());
    }


}
