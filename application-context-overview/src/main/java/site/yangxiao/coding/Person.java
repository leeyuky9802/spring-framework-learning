package site.yangxiao.coding;

public class Person {
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
}
