package Lesson2_task;

public class Circle1 {
    private double radius;
    private String color;

     Circle1(   ){
        this.radius = 1.0;
        this.color = "Red";
    }
    public Circle1(double radius, String color ) {
        this.radius = radius;
        this.color = color;
    }
        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}

