package Task6;

public class   CircleEx2 extends Shape implements GeometricObject {
    protected double radius;

    public CircleEx2(){
        radius = 1.0;
    }

    public CircleEx2(double radius){
        this.radius = radius;
    }
    public CircleEx2(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;}
    public void setRadius(double radius){this.radius = radius;}
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "} " + super.toString();
    }
}
