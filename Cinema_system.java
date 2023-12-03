import java.util.Scanner;
// Финальный готовый вариянт
public class Cinema_system {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter rows number: ");
        int rows = scanner.nextInt(); // ряды
        System.out.println("Enter seats number: ");
        int seats = scanner.nextInt(); // места
        int hall[][] = new int[rows][seats];

        сinemaHall(rows, seats, hall);
        menu(rows, seats, hall);
    }

    public static void menu(int rows, int seats, int[][] hall) {
        System.out.println();

        int input = 1;

        while(input != 0){
        System.out.println("1. Print seats ");
        System.out.println("2. Buy a ticket ");
        System.out.println("3. Show statistics");
        System.out.println("0. Exit ");
        input = scanner.nextInt();

        switch (input) {
            case 1 -> сinemaHall(rows, seats, hall);
            case 2 -> buyTicket(rows, seats, hall);
            case 3 -> ShowStatistics(rows, seats, hall);
        }
        }
    }

    public static void сinemaHall(int rows, int seats, int[][] hall) {      // Метод создает зал
        System.out.println("Cinema:");
        for (int i = 0; i <= rows; i++) {    //Цикл спуска по рядом
            if (i == 0) {
                System.out.print("  "); //двойной пробел
                for (int j = 0; j < seats; j++) {    //Цикл номераций мест
                    System.out.print(j + 1 + " ");
                }
            } else {
                System.out.println(" ");
                System.out.print(i + " ");   // Номерация рядов
                for (int k = 0; k < seats; k++) { //Цикл создания мест
                    if (hall[i - 1][k] == 0)
                        System.out.print("S ");
                    else
                        System.out.print("B ");
                }
            }
        }
        System.out.println();
    }

    public static void buyTicket(int rows, int seats, int[][] hall) {

        System.out.println("Enter row: ");
        int y1 = scanner.nextInt();
        System.out.println("Enter seats: ");
        int x1 = scanner.nextInt();

        if ((y1 <= rows && x1 <= seats) && ( y1 > 0 && x1 > 0)) {
            if (hall[y1 - 1][x1 - 1] == 0) {
                hall[y1 - 1][x1 - 1]++;
                System.out.println("Price: 10$");
            } else {
                System.out.println("Such seat doesn’t exist.");
                buyTicket(rows, seats, hall);
            }
        } else {
            System.out.println("Incorrect input");
        }
    }

    public static void ShowStatistics(int rows, int seats, int[][] hall) {
        int income = 0;
        int total = 0;
        int free = 0;
        int totalSeat = 0;

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < seats; k++) {
                if (hall[i][k] > 0) {
                    income += 10;
                    totalSeat++;
                } else {
                    free++;
                    totalSeat++;
                }
            }
        }
        for (int j = 0; j < rows * seats; j++) {   //Цикл сколько можно заработать
            total += 10;
        }

        System.out.println("Current income: " + income + " $");
        System.out.println("Total income: " + total + " $");
        System.out.println("Number of free seats: " + free);
        System.out.println("Total number of seats: " + totalSeat);
    }
}
