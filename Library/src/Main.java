import Items.Book;
import Items.DVD;
import Items.Magazin;
import Stage1.Librarian;
import Stage1.Member;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Librarian Bob = new Librarian(1, "Bob@", "BobCool", "Bob", "Biba", "Boba", 2);
        Librarian Alex = new Librarian(2, "Alex@", "AlexCool", "Alex", "Alex2", "Alex3", 1);
        Librarian[] librarians = {Bob, Alex};

        Member Dave = new Member(11, "Dave@", "DaveCool", "Dave", "Dave2", "Dave3");
        Member Masha = new Member(12, "Masha@", "MashaCool", "Masha", "Masha2", "Masha3");
        Member Tayler = new Member(13, "Tayler@", "TaylerCool", "Tayler", "Tayler2", "Tayler3");
        Member[] members = {Dave, Masha, Tayler};

        Book book1 = new Book(1, "book1", true, "Tor", "Гром и молния", "1234567890");
        Book book2 = new Book(2, "book2", true, "Flowe", "Великий барьер", "1234567890");
        Book book3 = new Book(3, "book3", true, "Ram", "Оперативная память3", "1234567890");
        Book book4 = new Book(4, "book4", true, "Po", "100 пельменей", "1234567890");
        Book[] books = {book1, book2, book3, book4};

        DVD dvd1 = new DVD(21, "В мире животных", true, 120);
        DVD dvd2 = new DVD(22, "В мире животных2", true, 120);
        DVD dvd3 = new DVD(23, "В мире животных3", true, 120);
        DVD[] dvds = {dvd1, dvd2, dvd3};

        Magazin magazin1 = new Magazin(31, "Кросворд", true, 111, "Belka");
        Magazin magazin2 = new Magazin(32, "Научные новости", true, 112, "Lupa");
        Magazin magazin3 = new Magazin(33, "Инженерная линейка", true, 113, "Molot");
        Magazin[] magazins = {magazin1, magazin2, magazin3};

        Library Library1 = new Library(librarians, members, books, dvds, magazins);


        System.out.println(ANSI_YELLOW + "Library Management System");
        System.out.println("=========================" + ANSI_RESET);
        System.out.println("Authorization User");
        System.out.println();
        System.out.println("Enter your login:");
        String inputLogin = scanner.nextLine();
        System.out.println("Enter your password:");
        String inputPassword = scanner.nextLine();

        for (int i = 0; i < Library1.getMembers().length; i++) {
            if (Library1.getMembers()[i].getLogin().equals(inputLogin)) {
                if (Library1.getMembers()[i].getPassword().equals(inputPassword)) {
                    MemberMenu(Library1);
                } else if (Library1.getLibraries()[i].getLogin().equals(inputLogin)) {
                    if (Library1.getLibraries()[i].getPassword().equals(inputPassword)) {
                        LibrarianMenu(Library1);
                    }
                } else
                    System.out.println("There is no user with this username");

            }
        }

    }

    public static void MemberMenu(Library library) {
        int exit;
        do {
            System.out.println(ANSI_YELLOW + "Member Menu:");
            System.out.println("=========================" + ANSI_RESET);

            System.out.println("1. List Items");  // Перечислить все пердметы
            System.out.println("2. Borrow Item");  // Одожить пердмет
            System.out.println("3. Search Items by type");  // Выполните поиск элементов по типу
            System.out.println("4. List borrowed Items"); // Перечислите заимствованные элементы
            System.out.println("5. Get profile info"); // Получите информацию о профиле
            System.out.println("6. Return Item"); // Верните элемент
            System.out.println("7. Logout"); //Выйдите из системы

            int inputCommand = scanner.nextInt();
            exit = inputCommand;

            switch (inputCommand) {
                case 1 -> library.ListItems();
                case 2 -> {
                    System.out.println("Какой передмет?");
                    library.ListItems();
                    int inputIndex = scanner.nextInt();
                    library.lendBook(inputIndex);
                    System.out.println();
                }
                case 3 -> System.out.println("Результат2");
                case 4 -> System.out.println("Результат3");
                case 5 -> System.out.println("Результат");
                case 6 -> System.out.println("Результат");
                case 7 -> System.out.println("До свидания");
                default -> System.out.println("Результат");
            }
        } while (exit != 7);

    }

    private static void LibrarianMenu(Library library) {
        int exit;
        do {
            System.out.println(ANSI_YELLOW + "Librarian Menu:");
            System.out.println("=========================" + ANSI_RESET);

            System.out.println("1. List Items");
            System.out.println("2. Borrow Item");
            System.out.println("3. Search Items by type");
            System.out.println("4. List borrowed Items");
            System.out.println("5. Get profile info");
            System.out.println("6. Return Item");
            System.out.println("7. Logout");

            int inputCommand = scanner.nextInt();
            exit = inputCommand;

            switch (inputCommand) {
                case 1 -> library.ListItems();
                case 2 -> System.out.println("Результат");
                case 3 -> System.out.println("Результат2");
                case 4 -> System.out.println("Результат3");
                case 5 -> System.out.println("Результат");
                case 6 -> System.out.println("Результат");
                case 7 -> System.out.println("До свидания");
                default -> System.out.println("Результат");
            }
        } while (exit != 7);

    }

}
