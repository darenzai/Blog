import Bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        //List集合
        ApplicationContext context=new ClassPathXmlApplicationContext("applicatonContext.xml");
        Person perosn= (Person) context.getBean("list");
        System.out.println("List :"+perosn.getList());

        //Set集合

        System.out.println("Set  :"+perosn.getSet());

        //Map集合
        System.out.println("Map  :"+perosn.getMap());
    }



}
