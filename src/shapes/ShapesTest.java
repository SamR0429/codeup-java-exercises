package shapes;

public class ShapesTest {


    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Quadrilateral myShape;

        myShape = new Rectangle(3, 5);
        System.out.println("the perimeter is " + myShape.getPerimeter());
        System.out.println("the area is " + myShape.getArea());

        myShape = new Square(5);
        System.out.println("the area is " + myShape.getPerimeter());
        System.out.println("the perimeter is " + myShape.getArea());

        double lengthTest = myShape.getLength();
        System.out.println("the length is " + myShape.length);
    }


}
