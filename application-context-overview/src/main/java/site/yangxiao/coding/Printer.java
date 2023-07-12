package site.yangxiao.coding;

import org.springframework.stereotype.Component;

@Component
public class Printer {
    public void print(Person person){
        System.out.println(person.getFirstName() + person.getLastName() + person.getEmail());
    }
}
