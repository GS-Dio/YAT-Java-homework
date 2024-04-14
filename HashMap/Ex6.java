package HashMap;

import java.util.HashMap;

public class Ex6 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("USA", "Washington DC");
        map.put("Norway", "Oslo");
        map.put("England", "London");
        map.put("Germany", "Berlin");

        System.out.println(map);

        HashMap<Integer, String> map2 = (HashMap<Integer, String>) map.clone();

        System.out.println(map2);
    }
}
