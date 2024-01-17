package Task4;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(12);
        Cylinder cylinder3 = new Cylinder(12, 7);
        Cylinder blueCylinder = new Cylinder(12, "Blue", 7);

        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println(blueCylinder);

        System.out.println("Volume =" + cylinder1.getVolume());
        System.out.println("Volume =" + cylinder2.getVolume());
        System.out.println("Volume =" + cylinder3.getVolume());
        System.out.println("Volume =" + blueCylinder.getVolume());
    }
}
