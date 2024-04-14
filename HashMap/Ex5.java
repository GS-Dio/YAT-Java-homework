package HashMap;

import java.util.HashMap;

public class Ex5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("USA", "Washington DC");
        map.put("Norway", "Oslo");
        map.put("England", "London");
        map.put("Germany", "Berlin");

        if (map.isEmpty()) {
            System.out.println("Карта пустая.");
        } else {
            System.out.println("Карта не пустая");
        }
    }
}
