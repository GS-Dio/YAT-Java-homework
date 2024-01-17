package Task4;

public class Circle2 extends Shape{
    private double radius;

    public Circle2() {
        super();
        this.radius = 1.0;
    }

    public Circle2(double radius) {
        super();
        this.radius = radius;
    }

    public Circle2(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle2{" + super.toString() + "radius=" + radius + '}';
    }
}
