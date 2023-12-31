package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;


    public Quadrilateral(double length, double width){
        this.width = width;
        this.length = length;

    }


    //Getters and Setters
    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }
    public abstract void setWidth(double width);

    public abstract void setLength(double length);

}
