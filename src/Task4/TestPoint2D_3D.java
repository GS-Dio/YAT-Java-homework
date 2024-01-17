package Task4;

public class TestPoint2D_3D {
        public static void main(String[] args) {

            Point2D point2D1 = new Point2D();
            Point2D point2D2 = new Point2D(2.5f, 3.0f);


            System.out.println("Point2D 1: (" + point2D1.getX() + ", " + point2D1.getY() + ")");
            System.out.println("Point2D 2: (" + point2D2.getX() + ", " + point2D2.getY() + ")");


            Point3D point3D1 = new Point3D();
            Point3D point3D2 = new Point3D(1.0f, 2.0f, 3.0f);


            System.out.println("Point3D 1: " + point3D1);
            System.out.println("Point3D 2: " + point3D2);
        }
}
