package Task3;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        center = new MyPoint(0, 0);
        radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(int x, int y) {
        center.setXY(x, y);
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

    public static void main(String[] args) {
        MyPoint center1 = new MyPoint(1, 2);
        MyPoint center2 = new MyPoint(3, 4);

        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(center1, 5);
        MyCircle circle3 = new MyCircle(6, 7, 8);

        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 3: " + circle3);

        System.out.println("Area of Circle 2: " + circle2.getArea());
        System.out.println("Circumference of Circle 2: " + circle2.getCircumference());

        System.out.println("Distance between Circle 2 and Circle 3: " + circle2.distance(circle3));
    }
}
