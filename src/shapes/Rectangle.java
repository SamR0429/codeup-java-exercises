package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


    //this was the code before the exercise told us to take it off
//    protected double length;
//    protected double width;
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//    public double getArea() {
//        return width * length;
//    }
//    public double getPerimeter() {
//        return 2 * (width + length);
//    }
//    public double getWidth() {
//        return width;
//    }
//    public void setWidth(double width) {
//        this.width = width;
//    }
//    public void setLength(double length) {
//        this.length = length;
//    }
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5.0, 8.0);
//        System.out.println("Area: " + rectangle.getArea());
//        System.out.println("Perimeter: " + rectangle.getPerimeter());
//    }


}



