package Task5;

public class MyCircle {
    private Point center;
    private int radius;

    public MyCircle() {
        center = new Point(0, 0);
        radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        center = new Point(x, y);
        this.radius = radius;
    }

    public MyCircle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
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

//    public int[] getCenterXY() {
//        return center.getXY();
//    }

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

//    public double distance(MyCircle another) {
//        return center.distance(another.center);
//    }
}