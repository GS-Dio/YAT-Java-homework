package Task2;

public class Apartment {
    public  String title;
    public int smet; //количество квадратных метров
    public String type; //тип строения. может быть "Cyberbricks", "Carbonpanel" или "Nanolite"
    public int cost;

    public Apartment(String title, int smet, String type, int cost) {
        this.title = title;
        this.smet = smet;
        this.type = type;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return title + " " + cost;
    }
}

