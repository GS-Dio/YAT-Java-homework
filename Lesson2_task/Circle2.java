package Lesson2_task;

public class Circle2 {
    private double radius;

    public Circle2(double radius, String color ) {
        this.radius = radius;

    }
    public double getCircumference(){
        return  2 * 3.14 * radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                "getCircumference" + getCircumference() +
                ']';
    }
}
