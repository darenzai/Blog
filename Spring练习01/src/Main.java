import Bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        //Appcliation容器
        /*

            Application Context 是 spring 中较高级的容器。和 BeanFactory 类似，
            它可以加载配置文件中定义的 bean，将所有的 bean 集中在一起，当有请求的时候分配 bean。
            另外，它增加了企业所需要的功能，比如，从属性文件中解析文本信息和将事件传递给所指定的监听器。
            这个容器在 org.springframework.context.ApplicationContext interface 接口中定义。

         */
        ApplicationContext context=new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        //BeanFactory容器在w3的教程中建议们除非在移动应用上使用此容器，否则不用（这个容器从一个 XML 文件中读取配置元数据，由这些元数据来生成一个被配置化的系统或者应用）
        XmlBeanFactory p1=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Person factory= (Person) p1.getBean("person");
        System.out.println(factory.getName());

        Person p= (Person) context.getBean("person");
        System.out.println(p.getName());
    }
}
