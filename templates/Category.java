package templates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Category {

    public static final String ANSI_RESET = "\u001B[0m";  // <-- Reset обрывает
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private String name;
    private List<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public void showProduct(){
        System.out.println(ANSI_YELLOW + name + ANSI_RESET  );
                for(int i = 0; i < products.size(); i++){
                    System.out.println(products.get(i));
                };
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return ANSI_YELLOW + name + ANSI_RESET  + ' ' +
                products ;
    }
}
