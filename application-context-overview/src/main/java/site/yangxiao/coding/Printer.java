package site.yangxiao.coding;

public class Printer {
    private Person person;

    public Printer(Person person) {
        this.person = person;
    }

    public void print(){
        System.out.println(person.getFirstName() + person.getLastName() + person.getEmail());
    }
}
