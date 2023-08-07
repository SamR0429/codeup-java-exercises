package shapes;

public class Rectangle {

    protected double length;
    protected double width;
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }





//
//


    public static void main(String[] args) {

//        Rectangle lengthOne = new Rectangle();
//        Rectangle widthOne = new Rectangle();


        Rectangle rectangle = new Rectangle(5.0, 8.0);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

    }

}



