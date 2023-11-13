import java.util.Scanner;

public class Swich {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
lesson6();
    }
    public static void Exercise1(){
        System.out.println("Введите месяц (1-12)");
        int a = scanner.nextInt();
        switch (a){
            case 12,1,2 -> {System.out.println("Зима");}

            case 3,4,5 -> {
                System.out.println("Весна");
            }
            case 6,7,8 -> {
                System.out.println("Лето");
            }
            case 9,10,11 -> {
                System.out.println("Осень");
            }
            default -> System.out.println("Введено неправельное значение.");
        }
    }
    public static void lesson2() {
        System.out.print("Введте ваш пол:");
        String s = scanner.next();
        switch (s) {
            case "М", "M", "m", "м" -> {
                System.out.print("Вы мужчина");
            }
            case "W", "Ж", "ж", "w" -> {
                System.out.print("Вы женщина");
            }
            default -> System.out.print("Вы боевой вертолетик.");
        }
    }
    public static void lesson3() {
        System.out.print("Введте месяц:");
        int s = scanner.nextInt();
        switch (s) {
            case 1, 5, 3, 7, 8, 10, 12 -> {
                System.out.print("В этом месяце 31 день");
            }
            case 2 -> {
                System.out.print("В этом месяце 28 дней");
            }
            case 4, 6, 9, 11 -> {
                System.out.print("В этом месяце 30 дней");
            }
            default -> System.out.print("Ошибка ввода.");
        }
    }
    public static void lesson4() {
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите операцию    (+ - * /): ");
        String s = scanner.next();
        switch (s) {
            case "+" -> {
                System.out.println("Результат " + (a + b));
            }
            case "-" -> {
                System.out.println("Результат " + (a - b));
            }
            case "*" -> {
                System.out.println("Результат " + a * b);
            }
            case "/" -> {
                System.out.println("Результат " + a / b);
            }
            default -> {
                System.out.println("Нет такого оператора");
            }
        }
    }
    public static void lesson5(){
        System.out.println("Единицы измерения");
        System.out.println("1 — дециметр:");
        System.out.println("2 — километр:");
        System.out.println("3 — метр:");
        System.out.println("4 — миллиметр:");
        System.out.println("5 — сантиметр:");
        System.out.print("Выбретите единицу измерения (1-5): ");
        int a = scanner.nextInt(); //единицу измерения
        System.out.print("Введите длину отрезка: ");
        int b = scanner.nextInt(); //длинa отрезка

    switch (a) {
        case 1 ->{System.out.println(b + " дециметров равняется = " + (b/10) + " метрам");}
        case 2 ->{System.out.println(b + " километров равняется = " + (b/10_00) + " метрам");}
        case 3 ->{System.out.println( (b) + " метр");}
        case 4 ->{System.out.println(b + " миллиметров равняется = " + (b*10_00) + " метрам");}
        case 5 ->{System.out.println(b + " сантиметров равняется = " + (b/100) + " метрам");}
        default -> { System.out.println("Нет такой едениций измерения");}
     }
    }
    public static void lesson6(){
        System.out.println("Единицы измерения массы");
        System.out.println("1 — килограмм:");
        System.out.println("2 — миллиграмм:");
        System.out.println("3 —  грамм:");
        System.out.println("4 — тонна:");
        System.out.println("5 — центнер:");
        System.out.print("Выбретите единицу измерения массы (1-5): ");
        int a = scanner.nextInt(); //единицу измерения
        System.out.print("Введите вес массы: ");
        int b = scanner.nextInt(); //Введите вес массы

        switch (a){
            case 1 ->{System.out.println(b + "килограмм");}
            case 2 ->{System.out.println(b + " миллиграмм равняется = " + (b/1_000_000) + " килограмм");}
            case 3 ->{System.out.println(b + " граммов равняется = " + (b/1_000) + " килограмм");}
            case 4 ->{System.out.println(b + " тонн равняется = " + (b*10_00) + " килограмм");}
            case 5 ->{System.out.println(b + " центнеров равняется = " + (b*100) + " килограмм");}
            default -> {System.out.println("Вы ввели не в диопозона измерения массы (1-5) ");}
        }
        }
    public static void lesson7(){
        System.out.println("Элементы окружности");
        System.out.println("1 — радиус R:");
        System.out.println("2 — диаметр :");
        System.out.println("3 — длина ");
        System.out.println("4 — площадь круга ");

        System.out.print("Выбретите элемент окружности (1-4): ");
        int a = scanner.nextInt(); //единицу измерения

        System.out.print("Введите значение окружности: ");
        int b = scanner.nextInt(); //Введите вес массы
//        π = 3.14;
//        R = D/2, D = 2*R,  L = 2*p*R, S = p*R*2;
        switch (a){
            case 1 ->{ System.out.println("Радиус равен" + b);
                       System.out.println("диаметр равен" + 2*b);
                       System.out.println("длина равен" + 2*3.14*b);
                       System.out.println("площадь круга равенa" + 3.14*b*2);}
            case 2 ->{ System.out.println("Радиус равен" + b/2);
                System.out.println("диаметр равен" + b);
                System.out.println("длина равен" + 2*3.14*b/2);
                System.out.println("площадь круга равенa" + 3.14*(b/2)*2);}
            case 3 ->{ System.out.println("Радиус равен" + (b/2/3.14));
                System.out.println("диаметр равен" + 2*(b/2/3.14));
                System.out.println("длина равен" + b);
                System.out.println("площадь круга равенa" + 3.14*(b/2/3.14)*2);}
            case 4 ->{ System.out.println("Радиус равен" + (b/2/3.14));
                System.out.println("диаметр равен" + 2*(b/2/3.14));
                System.out.println("длина равен" + 2*3.14*(b/2/3.14));
                System.out.println("площадь круга равенa" + b);}
            default -> {System.out.println("Вы не выьралм элемент окружности в диопозое=не (1-4)");}
        }
    }
    public static void lesson8(){
        System.out.println("Элементы равнобедренного прямоугольного треугольника");
        System.out.println("1 — катет a:");
        System.out.println("2 — гипотенуза :");
        System.out.println("3 — высота h, опущенная на гипотенузу ");
        System.out.println("4 — площадь ");

        System.out.print("Выбретите элементы равнобедренного прямоугольного треугольника (1-4): ");
        int a = scanner.nextInt(); //единицу измерения

        System.out.print("Введите значение равнобедренного прямоугольного треугольника: ");
        int b = scanner.nextInt(); //значение
//      1 — катет a,
//      2 — гипотенуза c = a·√2,
//      3 — высота h, опущенная на гипотенузу (h = c/2),
//      4 — площадь S = c·h/2.

        switch (a){
            case 1 ->{ System.out.println("катет равен" + b);
                System.out.println("гипотенуза равен" + b*Math.sqrt(2));
                System.out.println("высота равен" + (b*Math.sqrt(2))/2);
                System.out.println("площадь круга равенa" + (b*Math.sqrt(2))*((b*Math.sqrt(2))/2)/2 );}
            case 2 ->{ System.out.println("катет равен" + b/Math.sqrt(2));
                       System.out.println("гипотенуза равен" + b);
                       System.out.println("высота равен" + b/2);
                       System.out.println("площадь круга равенa" + b*(b/2)/2 );}
            case 3 ->{ System.out.println("катет равен" + (b*2)/Math.sqrt(2));
                System.out.println("гипотенуза равен" + b*2);
                System.out.println("высота равен" + b);
                System.out.println("площадь круга равенa" + (b*2)*b/2 );}
            case 4 ->{ System.out.println("катет равен" + (Math.sqrt(2)*b));
                System.out.println("гипотенуза равен" + (Math.sqrt(2)*b)*Math.sqrt(2));
                System.out.println("высота равен" + ((Math.sqrt(2)*b)*Math.sqrt(2))/2);
                System.out.println("площадь круга равенa" + b);}
            default -> {System.out.println("Вы не выбрали элемент окружности в диопозоне (1-4)");}
        }
    }
}
