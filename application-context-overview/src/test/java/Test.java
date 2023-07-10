import org.junit.Before;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.yangxiao.coding.Printer;

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
        Printer printer = classPathXmlApplicationContext.getBean("printer", Printer.class);
        printer.print();
        classPathXmlApplicationContext.registerShutdownHook();
    }
}
