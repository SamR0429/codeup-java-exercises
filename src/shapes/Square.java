package shapes;

public class Square extends Quadrilateral {

    public double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }



    @Override
    public double getPerimeter() {
        return 2 * (side + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    //    double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//    public double getArea() {
//        return (double) (Math.pow(this.side, 2));
//    }
//    public double getPerimeter() {
//        return (4 * this.side);
//    }


}
