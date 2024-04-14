import java.util.List;

public class Restaurant {
    private List<Item> menu;

    public Restaurant(List<Item> menu) {
        this.menu = menu;
    }

    public double averageRating(){
        double totalRating = 0;

        int itemCount = 0;
        for (Item item : menu) {
            totalRating  += item.getRating();
            itemCount++;
        }
        return totalRating/itemCount;
    }

    public List<Item> getMenu() {
        return menu;
    }

    public void setMenu(List<Item> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "menu=" + menu +
                '}';
    }
}
