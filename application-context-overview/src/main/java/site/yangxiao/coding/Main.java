package site.yangxiao.coding;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml");
        Printer printer = classPathXmlApplicationContext.getBean("printer", Printer.class);
        printer.print();
    }
}