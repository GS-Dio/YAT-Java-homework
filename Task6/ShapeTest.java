package Task6;

public class ShapeTest {

    public static void main(String[] args) {
        Shape circle = new Circle(5.5, "red", false);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Radius: " + ((Circle) circle).getRadius());

        Shape rectangle = new Rectangle(4.0, 5.0, "blue", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Width: " + ((Rectangle) rectangle).getWidth());
        System.out.println("Length: " + ((Rectangle) rectangle).getLength());

        Shape square = new Square(6.6, "green", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Color: " + square.getColor());
        System.out.println("Side: " + ((Square) square).getSide());
    }
}
