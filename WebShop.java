import templates.Basket;
import templates.Category;
import templates.Product;
import templates.User;

import java.text.NumberFormat;
import java.util.*;

public class WebShop{
    private List<User> users;
    private List<Category> categories;

    public WebShop() {
        this.users = new ArrayList<>();
        this.categories = new ArrayList<>();
    }

    public void showMyProducts(){
        int counter = 1;

        for(int i = 0; i < categories.size(); i++){
            System.out.println(categories.get(i).getName() + ":");
            for (int j = 0; j < categories.get(i).getProducts().size(); j++){
                System.out.println(counter + ". " + categories.get(i).getProducts().get(j));
                counter++;
            }
        }
    }
    public void addUser(User user){
        users.add(user);
    }
    public void buyBasket(User user) {
        System.out.println("Продукты\t\tКатегория\t\t\tЦена");
        System.out.println("--------------------------------------");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
        double totalCost = 0;

        Basket basket = user.getBasket();
        for (Product product : basket.getMyBasked()) {
            System.out.printf("%-15s\t%-25s\t%s%n", product.getName(), getCategoryName(product), currencyFormat.format(product.getPrice()));
            totalCost += product.getPrice();
        }

        System.out.println("--------------------------------------");
        System.out.printf("Итого:\t\t\t\t\t%s%n", currencyFormat.format(totalCost));

        // Очищаем корзину пользователя после покупки
        basket.getMyBasked().clear();
    }

    private String getCategoryName(Product product) {
        for (Category category : categories) {
            if (category.getProducts().contains(product)) {
                return category.getName();
            }
        }
        return "Категория не найдена)";
    }

    public void viewBasket(User user) {
        Basket basket = user.getBasket();
        System.out.println("Моя корзина :");
        System.out.println(basket);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addCategories(Category category){
        categories.add(category);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void showCategories(){
        int i = 0;
        for (Category category : categories){
            System.out.println(categories.get(i));
        }
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void sortProductByName(){
        List<Product> allProduct = new ArrayList<>();

        for (Category category : categories){
            allProduct.addAll(category.getProducts());
        }

        Collections.sort(allProduct, Comparator.comparing(Product::getName));

        for (Product product : allProduct){
            System.out.println(product);
        }
    }

    public void sortProductByPrice(){
        List<Product> allProduct = new ArrayList<>();

        for (Category category : categories){
            allProduct.addAll(category.getProducts());
        }

        Collections.sort(allProduct, Comparator.comparing(Product::getPrice));

        for (Product product : allProduct){
            System.out.println(product);
        }
    }

    public void sortProductByRating(){
        List<Product> allProduct = new ArrayList<>();

        for (Category category : categories){
            allProduct.addAll(category.getProducts());
        }

        Collections.sort(allProduct, Comparator.comparing(Product::getRating));

        for (Product product : allProduct){
            System.out.println(product);
        }
    }


}
