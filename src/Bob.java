import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner conversationWithBob = new Scanner(System.in);
        System.out.println("i want dinner mom");
        String userInput = conversationWithBob.next();

//need a loop to loop through what user inputs so bob responds accordingly
        if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        }else if (userInput.endsWith("?")){
            System.out.println("Sure.");
        }else if (userInput.equals(" ")){
            System.out.println("Fine. Be that way");
        }
//put something here to keep the convo going


    }

}
