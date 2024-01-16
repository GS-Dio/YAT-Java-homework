package Task3;

public class TestMyLine {
    public static void main(String[] args) {
        // Создаем точки
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        // Создаем линию
        MyLine line = new MyLine(point1, point2);

        // Выводим информацию о линии
        System.out.println("Line: " + line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());

        // Изменяем координаты точек
        point1.setX(0);
        point1.setY(0);
        point2.setX(3);
        point2.setY(4);

        // Выводим обновленную информацию о линии
        System.out.println("Updated Line: " + line);
        System.out.println("Updated Length: " + line.getLength());
        System.out.println("Updated Gradient: " + line.getGradient());
    }
}