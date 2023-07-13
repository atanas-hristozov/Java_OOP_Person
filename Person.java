public class Person {
    private String name;
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 0 && age<130){
            this.age = age;
        }
    }
    public Person(){
        name = "anonimus";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    /*public Person(String personName){
        name = personName;
    }*/
    public void sayName(){
        System.out.println("My name is " + name);
    }
    public void showAge(){
        System.out.println("My age is " + age);
    }
}
