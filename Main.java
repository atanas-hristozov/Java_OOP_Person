public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.setAge(10);
        person2.setAge(400);
        person1.showAge();
        person2.showAge();
        person1.setName("Jhon");
        person2.setName("Will");
        person1.sayName();
        person2.sayName();
        person3.sayName();
    }
}