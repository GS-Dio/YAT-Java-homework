import java.util.Scanner;

public class Methods {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise8();
    }

    public static void Exercise1() {
        System.out.print("Ввод: ");
        String a = scanner.nextLine();
        print1(a);
    }
    static void print1(String x) {
        System.out.println(x);
    }

    public static void Exercise2() {
        System.out.println("Введите три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        exx2(a, b, c);
    }
    static void exx2(int x, int y, int z) {
        if (x < y && x < z)
            System.out.println(x + " самое наименьшое число");
        else if (y < x && y < z)
            System.out.println(y + " самое наименьшое число");
        else if (z < y && z < x)
            System.out.println(z + " самое наименьшое число");
    }

    public static void Exercise3() {
        System.out.println("Введите число, а я определю положительный ли он.");
        int a = scanner.nextInt();
        exx3(a);
    }
    static void exx3(int x) {
        if (x >= 0) {
            System.out.println(x + " положтельное");
        } else
            System.out.println(x + " отрицательное");
    }

    public static void Exercise4() {
        System.out.println("Введите число: ");
        double a = scanner.nextDouble();
        System.out.println(exx4(a));
    }
    static double exx4(double x) {
        double z = x * x;
        return z;
    }

    public static void Exercise5() {
        MyCalculator();
        MyCalculator();
        MyCalculator();
    }
    static void MyCalculator() {
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите оператор (+ - * /): ");
        char ch = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        switch (ch) {
            case '+' -> System.out.println("Результат " + (a + b));
            case '-' -> System.out.println("Результат " + (a - b));
            case '*' -> System.out.println("Результат " + (a * b));
            case '/' -> System.out.println("Результат " + (a / b));
            default -> System.out.println("Невернвй ввод");
        }
        System.out.println("The end ");
        System.out.println(" ");
    }

    public static void Exercise6() {
        System.out.println("Введите три числа: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Среднее из трех чисел" + averageOfThree(a, b, c));
    }
    static double averageOfThree(double x, double y, double z) {
        double res = (x + y + z) / 3;
        return res;
    }

    public static void Exercise7() {
        System.out.println("Введите строку, а я найду средний символ: ");
        String a = scanner.nextLine();
        exx7(a);
    }
    static void exx7(String s) {
        int a = s.length();  //Число символов в строке

        int middleIndex = a / 2; //Число символов в строке

        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("Средний символ: " + s.charAt(middleIndex-1) + s.charAt(middleIndex));
            } else {
                System.out.println("Средний символ: " + s.charAt(middleIndex));
            }
        } else
            System.out.println("Некоректный ввод.");
    }

    public static void Exercise8(){
        System.out.print("Введите число: ");
        int a = scanner.nextInt();  //123
        exx8(a);
    }
    static int exx8(int a) {
        if (a == 0)
            return 0;
        return a % 10 + exx8(a / 10);

        // 123 % 10 + (123 / 10)
        // 3 + exx(12)
        // 3 + (12 % 10 + exx(12 / 10))
        // 3 + (2 + exx(1))
        // 3 + (2 + (1 % 10 + exx(1 / 10)))
        // 3 + (2 + (1 + 0))))
        // 3 + (2 + 1 + 0)
        // 3 + 3 = 6
    }
}