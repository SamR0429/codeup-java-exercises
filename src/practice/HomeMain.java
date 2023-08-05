package practice;

import org.w3c.dom.ls.LSOutput;
import util.Input;

public class HomeMain {

    public static void main(String[] args) {
        Input input = new Input();

        Home myHome = new Home("white", 4, 2, 2, 1);

//        System.out.println(myHome.getColor());

        Home yourHome = new Home("blue", 3, 1, 1, 1);

//        System.out.println(yourHome.getColor());

        System.out.println("what is your name?");
        String nameResponse = input.getString();
        System.out.println(nameResponse);

        System.out.println(Home.homesCreated);

    }
}


