package shapes;

import util.Input;


public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();


//        do {

            System.out.println("Please enter the radius of your circle");
            double circleResponse = input.getDouble();
            System.out.println(circleResponse);

            Circle circle = new Circle(circleResponse);

            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
//
//            System.out.println("Do you want to continue?");
//            boolean yesNo = input.yesNo();
//            System.out.println(yesNo);

//        }while(input.yesNo("do you want to create another circle?"));
    }
}