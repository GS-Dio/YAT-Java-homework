package Task5;

public class LineSubTest {
    public static void main(String[] args) {
        // Создаем две точки
        Point beginPoint = new Point(1, 2);
        Point endPoint = new Point(4, 6);

        // Создаем объект LineSub с использованием двух точек
        LineSub line = new LineSub(beginPoint, endPoint);

        // Выводим информацию о линии
        System.out.println("Line info:");
        System.out.println(line);

        // Изменяем координаты начальной точки
        line.setBeginX(3);
        line.setBeginY(5);

        // Изменяем координаты конечной точки
        line.setEndX(8);
        line.setEndY(10);

        // Выводим обновленную информацию о линии
        System.out.println("\nUpdated line info:");
        System.out.println(line);

        // Выводим длину линии
        System.out.println("\nLine length: " + line.getLength());

        // Выводим градиент линии
        System.out.println("Line gradient: " + line.getGradient());
    }
}
