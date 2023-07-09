import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.yangxiao.coding.Printer;

public class TestCode {
    @Test
    public void testXML(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
        Printer printer = classPathXmlApplicationContext.getBean("printer", Printer.class);
        printer.print();
    }
}
