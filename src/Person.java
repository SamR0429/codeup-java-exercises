import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Person {

    //    Scanner scan = new Scanner(System.in);
//        System.out.println("enter a name");
//    String userInput = scan.nextLine();
//        System.out.println(userInput);
//

    //properties
    private String name;


    //constructors
    public Person(String name){
        this.name = name;
    }

    //getters and setters
    public String getName() {
//TODO: return the person's name
        return this.name;
    }
    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    //other methods
    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s!%n" , this.name);
//        this.name = name;

    }

    public static void main(String[] args) {
//        Person personA = new Person("sam");
//        System.out.println(personA.getName());
//
//        personA.setName("Ben");
//        System.out.println(personA.getName());
//
//        personA.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }

}
