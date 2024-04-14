package HashMap;

import java.util.HashMap;

public class Ex4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("USA", "Washington DC");
        map.put("Norway", "Oslo");
        map.put("England", "London");
        map.put("Germany", "Berlin");

        map.clear();

        System.out.println(map);
    }
}
