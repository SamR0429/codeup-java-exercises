import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 2;
//        do {
//            System.out.println("i is " + i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println("i is " + i);
//            i-=5;
//        } while (i >= (-10));

//        long i = 2L;
//        do{
//            System.out.println(i);
//            i*=i;
//        }while(i <= 1000000);

//        for(int i = 100; i >= (-10); i-=5){
//            System.out.println(i);
//        }

//        for(long i = 2L; i <= 1000000; i*=i){
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0)
//                System.out.println("FizzBuzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }

//        boolean dontContinue = true;
//        do {
//            Scanner questionThree = new Scanner(System.in);
//            System.out.println("Can you enter a whole number?");
//            int userInput = questionThree.nextInt();
//            System.out.println(userInput);
//            // this needs a loop of some kind, where to put it ?
//
//            //start of table
//            int limit = userInput;
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int number = 1; number <= limit; number++) {
//                int squared = number * number;
//                int cubed = number * number * number;
//                System.out.printf("%-6d | %-7d | %-5d%n", number, squared, cubed);
//            }
//
//            //this is the last question
//            System.out.print("Do you want continue to the next step? [y/n]? ");
//            String userInput2 = questionThree.next().toLowerCase();
//
//            if (userInput2.equals("y")) {
//                System.out.println("continue");
//                dontContinue = false;
//            }
//
//        } while (dontContinue);


//#3 without the loop
//        Scanner questionThree = new Scanner(System.in);
//        System.out.println("Can you enter a whole number?");
//        int userInput = questionThree.nextInt();
//        System.out.println(userInput);
//        // this needs a loop of some kind, where to put it ?
//
//        //start of table
//        int limit = userInput;
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int number = 1; number <= limit; number++) {
//            int squared = number * number;
//            int cubed = number * number * number;
//            System.out.printf("%-6d | %-7d | %-5d%n", number, squared, cubed);
//        }
//
//        //this is the last question
//        System.out.print("Do you want to put another number in? [y/n]? ");
//        String userInput2 = questionThree.next().toLowerCase();
//
//        if(userInput2.equals("y")){
//            System.out.println("continue");
//        } else {
//            System.out.println("bye");
//        }


        do {
            int marks[] = new int[1];
            int i;
            float total = 0, avg;
            Scanner questionfour = new Scanner(System.in);

            for (i = 0; i < marks.length; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                marks[i] = questionfour.nextInt();
                total = total + marks[i];
            }
            questionfour.close();

            // Calculating average here
            avg = total / marks.length;
            System.out.print("The student Grade is: ");
            if (avg >= 88) {
                System.out.print("A");
            } else if (avg >= 80 && avg < 87) {
                System.out.print("B");
            } else if (avg >= 67 && avg < 79) {
                System.out.print("C");
            } else {
                System.out.print("D");
            }

        }while(false);
    }
}
