package Task6;

public class ShapeTest {

    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);// which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius()); //  s1 является экземпляром Shape а в этом классе нету такова метода

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s2 = new Shape(); //Shape абстрактный класс и поэтому нельзя создать его экземпляр

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength()); // в Shape нету такого метода, хотя есть в его потомке Rectangle

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide()); // s4 объект класса Shape а в нем нету такго метода

// Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;  // s4 объект класса Square и его нельзя привести к Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getSide()); // В классе Rectangle нету такова метода
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;  // то же самое Rectangle нельзя привести к Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
