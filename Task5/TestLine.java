package Task5;

public class TestLine {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        Line line1 = new Line(point1, point2);

        System.out.println("Информация о линии:");
        System.out.println(line1);

        System.out.println("Начальная точка: (" + line1.getBeginX() + ", " + line1.getBeginY() + ")");
        System.out.println("Конечная точка: (" + line1.getEndX() + ", " + line1.getEndY() + ")");

        System.out.println("Длина линии : " + line1.getLength());
        System.out.println("Угол наклона линии: " + line1.getGradient());
    }

}
