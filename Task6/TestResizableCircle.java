package Task6;

public class TestResizableCircle {

    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println("Original Circle: " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        resizableCircle.resize(50);
        System.out.println("Resized Circle: " + resizableCircle);
        System.out.println("Area after resizing: " + resizableCircle.getArea());
        System.out.println("Perimeter after resizing: " + resizableCircle.getPerimeter());
    }
}
