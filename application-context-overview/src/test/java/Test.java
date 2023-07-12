import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.yangxiao.coding.Person;
import site.yangxiao.coding.Printer;
import site.yangxiao.coding.persistance.PersonsDAO;

public class Test {
    private ClassPathXmlApplicationContext classPathXmlApplicationContext;
    private ConfigurableApplicationContext configurableApplicationContext;

    @Before
    public void generateApplicationContext(){
        this.classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
        this.configurableApplicationContext = this.classPathXmlApplicationContext;
    }
    @org.junit.Test
    public void testXML(){
        Person person = new Person();
        person.setFirstName("Xiao");
        person.setLastName("yang");
        person.setEmail("leeyuky9802@gmail.com");

        PersonsDAO something = classPathXmlApplicationContext.getBean("personsDAO", PersonsDAO.class);
        something.save(person);
    }
}
