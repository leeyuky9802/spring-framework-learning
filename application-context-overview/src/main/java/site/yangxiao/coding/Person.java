package site.yangxiao.coding;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public static Person getXiaoYang(){
        Person person = new Person();
        person.setEmail("leeyuky9802@gmail.com");
        person.setFirstName("Xiao");
        person.setLastName("Yang");
        return person;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hi! at around 3 am at Feb 10th, 2001, I was born.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("there ends my brief life in this very container that i built my own");
    }
}
