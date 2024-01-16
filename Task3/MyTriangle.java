package Task3;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ']';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        if (v1.equals(v2) && v1.equals(v3)) {
            return "equilateral";
        } else if (v1.equals(v2) || v1.equals(v3) || v2.equals(v3)) {
            return "isosceles";
        } else
            return "scalene";
    }

    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(4, 0);
        MyPoint v3 = new MyPoint(2, 3);

        MyTriangle triangle1 = new MyTriangle(v1, v2, v3);

        System.out.println("Triangle 1: " + triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        MyTriangle triangle2 = new MyTriangle(1, 1, 5, 1, 3, 4);

        System.out.println("Triangle 2: " + triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());
    }
}