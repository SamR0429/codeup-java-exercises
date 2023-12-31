import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class MethodsExercises {
//    public static String sayHello(String name) {
//        return String.format("Hello, %s!", name);
//    }
//
//    public static void sayHello2(String greeting, String name) {
//        System.out.printf("%s, %s!\n", greeting, name);
//    }
//

    // version 1
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//    // version 2
//    public static void sayHello() {
//        sayHello("Hello", "World");
//    }
//    // version 3
//    public static void sayHello(String name) { //ask why this is calling the function and the method after is using sout
//        sayHello("Hello", name);
//    }
//    // version 4
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + ", " + name + "!");
//    }

//    public static void changeString(String s) {
//        s = "Wub a lub a dub dub";
//    }

//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1); // ask why this is -1 if the number above is 0 ? is it counting by ones ? is it doing something else?
//    }

//    public static long getPower(int base, int exponent) {
//        if (exponent == 0) {
//            return 1;
//        } else if (exponent == 1) {
//            return base;
//        } else if (exponent == 2) {
//            return base * base;
//        }
//        return base * getPower(base, exponent - 1);
//    }


    // question one
//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int adding(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtract(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int divide(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }

    // question 2










    //--------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------

//        sayHello(3);
//        sayHello();
//        sayHello("Codeup");
//        sayHello("Salutations", "Codeup");


//        String changeMe = "hello codeup!";
//        changeString(changeMe);
//        System.out.println(changeMe);

//        count(5);

//        int base = 3;
//        int exponent = 4;
//        long result = getPower(base, exponent);
//        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        //question one
        // multiplying
//        int result = multiply(8, 7);
//        System.out.println("The result is: " + result);
//
//        //adding
//        int sum = adding(0, 1);
//        System.out.println("the sum is: " + sum);
//
//        //subtracting
//        int difference = subtract(0, 1);
//        System.out.println("the difference is: " + difference);
//
//        //dividing
//        int qoutent = divide(10, 5);
//        System.out.println("the qoutent is: " + qoutent);
//
//        //modulus
//        int remainder = modulus(25, 7);
//        System.out.println("the remainder is: " + remainder);

        //question two


//        Scanner forGettingInteger = new Scanner(System.in);
////
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//
//        System.out.println("your number is: " + getInteger(1,10));
//
//        //question 3
//        int factorial = getInteger(1, 10);
        boolean quit = false;
//        while(!quit){
//            System.out.println("the factorial of " + factorial + "is" + getFactorial(factorial));
//            System.out.println("do you want to continue? [y/n]");
//            quit = quit();
//        }
        quit = false;

        while(!quit){
            System.out.println("how many sides do you want on your die?");
            int faces = getInteger(1, 100);
            System.out.println("result 1 is " + rollDice(faces) + "\nresult 2 is " + rollDice(faces));
            System.out.println("Do you want to continue? [y/n]");
            quit = quit();
        }

    }
        private static boolean quit(){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            return Character.toLowerCase(input.charAt(0)) != 'y';
        }

        private static long getFactorial(int factorial){
            long result = 1;
            for(int i =1; i <= factorial; i++){
                result *= i;
            }
            return result;
        }

    public static int getInteger(int min, int max) {

        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.println("please enter a integer between " + min + " and " + max + ".");
            input = scan.nextInt();
        }while (!isInRange(input, min, max));

        return input;
    }
    public static boolean isInRange(int input, int min, int max){
        return input <= max && input >= min;
    }

    public static int rollDice (int totalSides){
        return new Random().nextInt(1, totalSides);
    }
}
