package templates;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    public static final String ANSI_RESET = "\u001B[0m";  // <-- Reset обрывает
    public static final String ANSI_BLUE = "\u001B[34m";

    private List<Product> myBasked;

    public Basket() {
        this.myBasked = new ArrayList<>();
    }

    public void addMyBasket(Product product){
        myBasked.add(product);
    }
    public void removeMyBasket(Product product){
        myBasked.remove(product);
    }

    public List<Product> getMyBasked() {
        return myBasked;
    }

    public void setMyBasked(List<Product> myBasked) {
        this.myBasked = myBasked;
    }

    @Override
    public String toString() {
        return ANSI_BLUE + "Basket " + ANSI_RESET + myBasked ;
    }
}
