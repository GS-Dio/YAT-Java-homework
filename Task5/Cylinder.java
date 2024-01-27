package Task5;

public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height, double radius, String coulor) {
        this.height = height;
        base = new Circle(radius,coulor);
    }

    public Cylinder(double height,double radius) {
        this.height = height;
        base = new Circle(radius);
    }

    public double getRadius() {
        return base.getRadius();
    }
    public void setRadius(double radius) {
        base.setRadius(radius);
    }
    public String getColor(){
        return base.getColor();
    }
    public void setColor(String color){ base.setColor(color);}
    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(base.getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}