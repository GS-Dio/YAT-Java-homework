import Items.Book;
import Items.DVD;
import Items.Magazin;
import Stage1.Librarian;
import Stage1.Member;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//            Librarian Bob = new Librarian(1, "Bob", "BobCool", "Bob", "Biba", "Boba", 2);
//            Librarian Alex = new Librarian(2, "Alex", "AlexCool", "Alex", "Alex2", "Alex3", 1);
//            Librarian[] librarians = {Bob, Alex};
//
//            Member Dave = new Member(11, "Dave", "DaveCool", "Dave", "David", "Daveson");
//            Member Masha = new Member(12, "Masha", "MashaCool", "Masha", "Sorocova", "Sergevna");
//            Member Tayler = new Member(13, "Tayler", "TaylerCool", "Tayler", "Derden", "*Secret*");
//            Member[] members = {Dave, Masha, Tayler};
//
//            Book book1 = new Book(1, "book1", true, "Tor", "Гром и молния", "1234567890");
//            Book book2 = new Book(2, "book2", true, "Flowe", "Великий барьер", "1234567890");
//            Book book3 = new Book(3, "book3", true, "Ram", "Оперативная память3", "1234567890");
//            Book book4 = new Book(4, "book4", true, "Po", "100 пельменей", "1234567890");
//            Book[] books = {book1, book2, book3, book4};
//
//            DVD dvd1 = new DVD(21, "В мире животных", true, 120);
//            DVD dvd2 = new DVD(22, "В мире животных2", true, 120);
//            DVD dvd3 = new DVD(23, "В мире животных3", true, 120);
//            DVD[] dvds = {dvd1, dvd2, dvd3};
//
//            Magazin magazin1 = new Magazin(31, "Кроссворд", true, 111, "Belka");
//            Magazin magazin2 = new Magazin(32, "Научные новости", true, 112, "Lupa");
//            Magazin magazin3 = new Magazin(33, "Инженерная линейка", true, 113, "Molot");
//        Magazin[] magazins = {magazin1, magazin2, magazin3};
//
//   Library Library1 = new Library(librarians, members, books, dvds, magazins);

            Library Library1 = deserializableLibrary();

        int exit = 1;
        while (exit == 1) {
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
                        MemberMenu(Library1, inputLogin);
                    }
                }
            }
            for (int i = 0; i <Library1.getLibraries().length; i++) {
                if (Library1.getLibraries()[i].getLogin().equals(inputLogin)) {
                    if (Library1.getLibraries()[i].getPassword().equals(inputPassword)) {
                        LibrarianMenu(Library1);
                    }
                }
            }

            System.out.println("Желаете продолжить: (1 - Yes, 0 - No)");
            exit = scanner.nextInt();
            scanner.nextLine();

            serializableLibrary(Library1);
        }
    }

    private static void serializableLibrary(Library Library1) {
        try {
            String filePath = "library1.ser";
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(Library1);
            objectOutputStream.close();
            System.out.println("Данные успешно сохранены!");
        } catch (IOException e) {
            System.out.println("Не удалось сохранить файл: " + e.getMessage());
        }
    }

    private static Library deserializableLibrary() {
        try {
            String filePath = "library1.ser";
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            return (Library) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Не удалось загрузить файл: " + e.getMessage());
        }
        return null;
    }


    public static void MemberMenu(Library library, String memberLogin) {
        int exit;
        do {
            System.out.println();
            System.out.println(ANSI_YELLOW + "Member Menu:");
            System.out.println("=========================" + ANSI_RESET);

            System.out.println("1. List Items");  // Перечислить все пердметы
            System.out.println("2. Borrow Item");  // одожить перемет
            System.out.println("3. Search Items by type");  // Выполните поиск элементов по типу
            System.out.println("4. List borrowed Items"); // Перечислите заимствованные элементы
            System.out.println("5. Get profile info"); // Получите информацию о профиле
            System.out.println("6. Return Item"); // Верните элемент
            System.out.println("7. Logout"); //Выйдите из системы

            int inputCommand = getInputNumber(scanner);
            exit = inputCommand;

            switch (inputCommand) {
                case 1 -> {
                    System.out.println(ANSI_YELLOW + "List Items:");
                    System.out.println("=========================" + ANSI_RESET);
                    library.ListItems();
                }
                case 2 -> {
                    System.out.println(ANSI_YELLOW + "Borrow Item:");
                    System.out.println("=========================" + ANSI_RESET);
                    System.out.println("Какой передмет?");
                    library.ListItems();
                    int inputIndex = getInputNumber(scanner) - 1;
                    library.lendItem(inputIndex, memberLogin);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Какие предметы вы хотите посмотреть: \n1. Books\n2. DVDs\n3. Magazins");
                    int input = getInputNumber(scanner);
                    switch (input) {
                        case 1 -> library.ListBooks();
                        case 2 -> library.ListDvds();
                        case 3 -> library.ListMagazins();
                        default -> System.out.println();
                    }

                    System.out.println();
                }
                case 4 -> {
                    System.out.println(ANSI_YELLOW + " List borrowed Items:");
                    System.out.println("=========================" + ANSI_RESET);
                    library.showItems(memberLogin);

                }
                case 5 -> {
                    System.out.println(ANSI_YELLOW + "Member info:");
                    System.out.println("=========================" + ANSI_RESET);
                    library.memberInfo(memberLogin);
                }
                case 6 -> {
                    System.out.println("Какой передмет вы хотите вернуть?");
                    library.showItems(memberLogin);
                    int inputIndex = getInputNumber(scanner) - 1;
                    library.returnItem(inputIndex, memberLogin);
                    System.out.println();
                    System.out.println("Вы успешно вернули передмет!");
                }
                case 7 -> System.out.println("До свидания!!!");
                default -> {
                    System.out.println("Результат");
                    return;
                }
            }
        } while (exit != 7);

    }

    private static void LibrarianMenu(Library library) {
        int exit;
        do {
            System.out.println(ANSI_YELLOW + "Librarian Menu:");
            System.out.println("=========================" + ANSI_RESET);

            System.out.println("1. List Items");
            System.out.println("2. Get Profile Info");
            System.out.println("3. List Users");
            System.out.println("4. Deactivate/Activate User");
            System.out.println("5. List Borrowed Items");
            System.out.println("6. Search Items by Type");
            System.out.println("7. Logout");

            int inputCommand = getInputNumber(scanner);
            exit = inputCommand;

            switch (inputCommand) {
                case 1 -> library.ListItems();
                case 2 -> library.infoOfMembers();
                case 3 -> library.listAllMembers();
                case 4 -> {
                    System.out.println("Вы хотите \n1.Активировать пользователя\n2.Деактивизировать пользователя");
                    int input = getInputNumber(scanner);
                    switch (input) {
                        case 1 -> {
                            System.out.println("Какова пользователя:");
                            library.listDeActivMembers();
                            int indexMember = getInputNumber(scanner)- 1;
                            System.out.println("Пользователь актевирован");
                            library.activateMember(indexMember);
                        }
                        case 2 -> {
                            System.out.println("Какова пользователя:");
                            library.listActivMembers();
                            int indexMember = getInputNumber(scanner) - 1;
                            library.deActivateMember(indexMember);
                        }
                    }
                }
                case 5 -> library.listBorrowItem();
                case 6 -> {
                    System.out.println("Какие предметы вы хотите посмотреть: \n1. Books\n2. DVDs\n3. Magazins");
                    int input = getInputNumber(scanner);
                    switch (input) {
                        case 1 -> library.ListBooks();
                        case 2 -> library.ListDvds();
                        case 3 -> library.ListMagazins();
                        default -> System.out.println();
                    }
                    System.out.println();}

                case 7 -> System.out.println("До свидания");
                default -> System.out.println("Результат");
            }
        } while (exit != 7);
    }

    public static int getInputNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int inputCommand = scanner.nextInt();
                scanner.nextLine();
                return inputCommand;
            } else {
                System.out.println("Ошибка ввода, повторите попытку");
                scanner.nextLine();
            }
        }
    }

}