package Task4;

public class TestShapes {
    public static void main(String[] args) {

        Circle2 circle = new Circle2(5.0);
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Square square = new Square(2.0);


        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        System.out.println();

        System.out.println("Square:");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.isFilled());
    }
}
