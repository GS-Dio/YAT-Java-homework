package Task1;

import java.util.Scanner;

public class Book2 {
    private String title;
    private int price;
    private String type;
    private int sold;

    public Book2(String title, int price, String type, int sold) {
        this.title = title;
        this.price = price;
        this.type = type;
        this.sold = sold;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int revenueDay() {
        int revenue = 0;

        if (type.equals("Simple")) {
            if (sold <= 50) {
                revenue = price * sold;
            } else {
                revenue = (50 * price) + ((sold - 50) * (int) (price * 1.2));
            }
        } else {
            if (sold <= 50) {
                revenue = (int) (sold * (price - (price * 0.2)));
            } else {
                revenue = (int) (50 * (price - (price * 0.2))) + ((sold - 50) * price);
            }
        }

        return revenue;
    }

    @Override
    public String toString() {
        return title + " " + price + " " + type + " "+ sold;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("Введите количество книг:");
        int N = scanner.nextInt();
        scanner.nextLine();

        Book2[] books = new Book2[N];

        for (int i = 0; i < N; i++){
            System.out.println("Введите книгу по шаблону");

            System.out.println("[Название]");
            String title = scanner.nextLine();

            System.out.println("[Цена]");
            int price = Integer.parseInt(scanner.nextLine());

            System.out.println("[Жанр (Simple/Classical)]");
            String type = scanner.nextLine();

            System.out.println("[Количество]");
            int sold = scanner.nextInt();
            scanner.nextLine();

            books[i] = new Book2(title, price, type, sold);
            System.out.println(" ");
        }

        for (int i = 0; i < N; i++){
            System.out.println(books[i].title + " "+ books[i].revenueDay() );
            total += books[i].revenueDay();
        }
        System.out.println("Total " + total);
    }
}
// Мой output
//DayWithUnicorn 250000
//Kodzima_genius 430000
//Amphibious 144000
//Parry_Hotter 200000
//GoThrow 100000
//LoveInWar 540000
//Total 1664000