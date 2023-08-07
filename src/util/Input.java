package util;


import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }


    public boolean yesNo() {

        String userInput = scanner.nextLine();
        return userInput.startsWith("y") || userInput.startsWith("Y");

        /* this was steves way, obviously better
        return this.getString().trim().toLowerCase().startsWith("y");
       */

    }

    public int getInt(int min, int max) {

        int userInputTwoA;

        do {
            System.out.println("please enter a integer between " + min + " and " + max + ".");
            userInputTwoA = scanner.nextInt();
        } while (!isInRange(userInputTwoA, min, max));

        System.out.println("you have entered the right number");
        return userInputTwoA;

    }

    public static boolean isInRange(int input, int min, int max) {
        return input <= max && input >= min;
    }

    public static boolean isInRange(double input, double min, double max) {
        return input <= max && input >= min;
    }

    public int getInt() {
        int userInputTwo = scanner.nextInt();
        return userInputTwo;
    }

    public double getDouble(double min, double max) {
        double userInputThree;

        do {
            System.out.println("please enter a integer between " + min + " and " + max + ".");
            userInputThree = scanner.nextDouble();
        } while (!isInRange(userInputThree, min, max));

        System.out.println("you have entered the right number");
        return userInputThree;
    }

    public double getDouble() {
        double userInputThree = scanner.nextDouble();
        return userInputThree;
    }

//    public getInteger(int min, int max) {
//
//        int input;
//
//        do {
//            System.out.println("please enter a integer between " + min + " and " + max + ".");
//            input = scanner.nextInt();
//        }while (!isInRange(input, min, max));
//
//        return input;
//    }
//    public boolean isInRange(int input, int min, int max){
//        return input <= max && input >= min;
//    }


}
