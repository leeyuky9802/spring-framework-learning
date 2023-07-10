import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.yangxiao.coding.Printer;

public class TestCode {
    @Test
    public void testXML(){
        ConfigurableApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
        Printer printer = classPathXmlApplicationContext.getBean("printer", Printer.class);
        printer.print();
        classPathXmlApplicationContext.registerShutdownHook();
    }
}
