package Task4;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println("Initial state: " + movablePoint);

        movablePoint.move();
        System.out.println("After moving: " + movablePoint);

        movablePoint.setSpeed(5, 6);
        movablePoint.move();
        System.out.println("After second move: " + movablePoint);
    }
}
