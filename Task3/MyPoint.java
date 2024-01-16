package Task3;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ',' + y + ')';
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance() {
        int xDiff = this.x;
        int yDiff = this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {
//        MyPoint p1 = new MyPoint();  // Test constructor
//        System.out.println(p1);      // Test toString()
//        p1.setX(8);   // Test setters
//        p1.setY(6);
//        System.out.println("x is: " + p1.getX());  // Test getters
//        System.out.println("y is: " + p1.getY());
//        p1.setXY(3, 0);   // Test setXY()
//        System.out.println(p1.getXY()[0]);  // Test getXY()
//        System.out.println(p1.getXY()[1]);
//        System.out.println(p1);
//
//        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
//        System.out.println(p2);
//// Testing the overloaded methods distance()
//        System.out.println(p1.distance(p2));    // which version?
//        System.out.println(p2.distance(p1));    // which version?
//        System.out.println(p1.distance(5, 6));  // which version?
//        System.out.println(p1.distance(0,0));      // which version?
//
        MyPoint[] myPoints = new MyPoint[11];

        for (int i = 1; i < myPoints.length; i++) {
            myPoints[i] = new MyPoint(i, i);
        }
        for (int i = 0; i < myPoints.length; i++) {
            System.out.println(myPoints[i]);
        }
    }
}
