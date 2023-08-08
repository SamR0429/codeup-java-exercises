package shapes;

public class Square extends Rectangle {

double side;

    public Square(double side) {
        super(side, side);
        this.side = side;

    }

    public double getArea(){
        return (double) (Math.pow(this.side, 2));
    }

    public double getPerimeter(){
        return (4 * this.side);
    }



}
