package Task5;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);   // Construct a Point
        System.out.println(p1);
        // Try setting p1 to (100, 10).
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.setX(30);
        p1.setY(130);
        p1.setXY(100,10);
    }
}
