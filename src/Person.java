public class Person {
    String name, surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    public  void changePerson (Person person) {
        Person il = new Person("в", "в");
        person = il;

    }
}
