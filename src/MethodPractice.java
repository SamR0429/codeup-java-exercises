import java.util.Scanner;

public class MethodPractice {

    // TODO: Create a new class called MethodPractice and add main method to test these methods...


    // TODO: Write a method, returnName, that returns the string of your name.


// you did this one, it works but technically it was wrong since it wasn't returning a string
//    public static void returnName() {
//
//        Scanner returnNameScanner = new Scanner(System.in);
//        System.out.println("enter your name");
//        String userInput = returnNameScanner.next();
//        System.out.println(userInput);
//    }

    public static String returnName() {
        return "sam";
    }

    // TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.

    public static String returnLongerString(String string1, String string2) {

        if (string1.length() >= string2.length()) {
            return string1;
        } else {
            return string2;
        }

    }

    // TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
    public static boolean canBeHalved(int integer) {

        boolean intIsEven = integer % 2 == 0;
        return intIsEven;

    }

    // TODO: !! Complete math exercises from the curriculum !!


    /**
     * OVERLOAD MINI-EXERCISES
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"
    public static String sayName(String name) {
        return "hello " + name;
    }

    public static String sayName(String userInput1, String userInput2) {
//        return "Hello, " + userInput1 + " " + userInput2 + ".";
        return String.format("Hello, %s %s.", userInput1, userInput2);

//        return sayName(userInput1 + " " + userInput2);
//        String fullName = String.format("%s %s", userInput1, userInput2);
//        return sayName(fullName);
    }

// you did this one and it works but you had to do it with an overload, so you redid it at the top
//    public static void sayName(String userInput1, String userInput2) {
////        return "Hi " + userInput1 + userInput2;
//        sayName("Hi" , userInput1 + userInput2);
//    }

    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles
//    public static int reMath(int input) {
//
//
//
//    }

    public static void main(String[] args) {

//        returnName();
//        System.out.println(returnName());
//
//        String longerString = returnLongerString("justin", "cat");
//        System.out.println(longerString);
//
//        System.out.println(canBeHalved(10));

        System.out.println(sayName("sam"));
//        System.out.println(sayName("sam ", "ramos"));
//        sayName("sam" , "ramos");

        System.out.println(sayName("sam", "ramos"));


    }


}
