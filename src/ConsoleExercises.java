
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.println(pi);
//
//        System.out.printf("The value of pi is approximately, %.2f.%n", pi); // the .2f cuts off the number after 2 decimal places

//        Scanner questionone = new Scanner(System.in);
//        System.out.println("enter a number");
//        int userInput = questionone.nextInt(); // this breaks if you put anything but a integer(whole number) in there
//        System.out.println("You entered: \"" + userInput + "\" ");

//        Scanner questiontwo = new Scanner(System.in);
//        System.out.println("enter three words");
//        String userInput = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.println("you entered: \"" + userInput + "\" ");
//        System.out.println("you entered: \"" + userInput2 + "\" ");
//        System.out.println("you entered: \"" + userInput3 + "\" ");

//        Scanner questionthree = new Scanner(System.in); // this one doesnt spit out the whole sentence inputted just the first letter or word
//        System.out.println("enter a sentence");
//        String userInput = questionthree.next();
//        System.out.println("you entered: \"" + userInput + "\" ");

//        Scanner questionfour = new Scanner(System.in);
//        System.out.println("enter a sentence");
//        String userInput = questionfour.nextLine(); // this one does spit out the whole sentence because of the nextLine part
//        System.out.println("you entered: \"" + userInput + "\" ");

        Scanner questiononeb = new Scanner(System.in);
        System.out.println("what is the length of the classroom?");
        String userInput = questiononeb.nextLine();
        int number1 = Integer.parseInt(userInput);
        System.out.println("what is the width of the classroom?");
        String userInput2 = questiononeb.nextLine();
        int number2 = Integer.parseInt(userInput2);
        System.out.println("The length is: \"" + number1 + "\" ");
        System.out.println("The width is: \"" + number2 + "\" ");

        int areaCal = number2 * number1;
        System.out.println("this is the area: \"" + areaCal + "\" ");
        int perimeterCal = number2 + number1;
        System.out.println("this is the area: \"" + perimeterCal + "\" ");
    }


}
