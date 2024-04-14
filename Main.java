import templates.Category;
import templates.Product;
import templates.User;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Product dress = new Product("Платье", 49.99, 4.5);
        Product skirt = new Product("Юбка", 29.99, 4.2);
        Product shirt = new Product("Рубашка", 39.99, 4.0);
        Product jeans = new Product("Джинсы", 59.99, 4.3);
        Product suit = new Product("Детский костюм", 34.99, 4.1);
        Product tShirt = new Product("Детские футболки", 19.99, 4.4);

        Category women = new Category("Женская одежда");
        Category men = new Category("Мужская одежда");
        Category kids = new Category("Детская одежда");

        women.addProduct(dress);
        women.addProduct(skirt);
        men.addProduct(shirt);
        men.addProduct(jeans);
        kids.addProduct(suit);
        kids.addProduct(tShirt);

        User Dave = new User("Dave","1234");
        Dave.addBasket(suit);
        Dave.addBasket(tShirt);

        User Sasha = new User("Sasha","1234");
        Sasha.addBasket(dress);
        Sasha.addBasket(shirt);


        final WebShop market = new WebShop();

        market.addUser(Dave);
        market.addUser(Sasha);

        market.addCategories(women);
        market.addCategories(men);
        market.addCategories(kids);

        //Вход в приложение
        System.out.println("Введите свой login:");
        String testLogin = scanner.nextLine();
        System.out.println("Введите password: ");
        String testPassword = scanner.nextLine();

        for(User user : market.getUsers()){
            if(user.getLogin().equals(testLogin) && user.getPassword().equals(testPassword)){
                menu(market,user);
            }
        }
    }

    private static void menu(WebShop webShop, User user) {
        int exit;
        do {
            System.out.println(ANSI_YELLOW + "Меню:");
            System.out.println("=========================" + ANSI_RESET);

            System.out.println("1. Каталог товаров");
            System.out.println("2. Товары категорий...");
            System.out.println("3. Отсортировать товары по...");
            System.out.println("4. Добавить товар в корзину");
            System.out.println("5. Купить товары в корзине");
            System.out.println("6. Моя корзина");
            System.out.println("7. Выйти");

            int inputCommand = scanner.nextInt();
            exit = inputCommand;

            switch (inputCommand) {
                case 1 -> {
                    for(int i = 0; i < webShop.getCategories().size(); i++){
                        System.out.println(webShop.getCategories().get(i));
                    }
                }
                case 2 -> {
                    System.out.println("Товары какой категорий вы хотите увидеть:");
                for (int i = 0; i < webShop.getCategories().size(); i++) {
                    System.out.println(i + 1 + "." + webShop.getCategories().get(i).getName());
                }
                int tempCategory = scanner.nextInt();

                System.out.println(webShop.getCategories().get(tempCategory - 1));
                }
                case 3 ->{
                    System.out.println("Отсортировать по:");
                    System.out.println("1. Имени");
                    System.out.println("2. Цене");
                    System.out.println("3. Рейтингу");

                    int tempSort = scanner.nextInt();

                    switch (tempSort){
                        case 1 -> webShop.sortProductByName();
                        case 2 -> webShop.sortProductByPrice();
                        case 3 -> webShop.sortProductByRating();
                    }
                }
                case 4 -> {
                    System.out.println("Выберите категорию товаров для добавления в корзину:");
                    for (int i = 0; i < webShop.getCategories().size(); i++) {
                        System.out.println((i + 1) + ". " + webShop.getCategories().get(i).getName());
                    }
                    int categoryChoice = scanner.nextInt();

                    List<Product> products = webShop.getCategories().get(categoryChoice - 1).getProducts();

                    System.out.println("Выберите продукт для добавления в корзину:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }

                    int productChoice = scanner.nextInt();

                    Product selectedProduct = products.get(productChoice - 1);

                    user.addBasket(selectedProduct);
                    System.out.println("Товар успешно добавлен в корзину!");
                }

                case 5 ->{
                    webShop.buyBasket(user);
                }
                case 6 -> {
                    webShop.viewBasket(user);
                }
                case 7 -> System.out.println("До свидания");
                default -> System.out.println("Результат");
            }
        } while (exit != 7);
    }
}