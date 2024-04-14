package HashMap;

import java.util.HashMap;

public class Ex111 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("USA", "Washington DC");
        map.put("Norway", "Oslo");
        map.put("England", "London");
        map.put("Germany", "Berlin");

        System.out.println(map);

        HashMap<String, String> map2 = new HashMap<>();

        map2.put("Sus","amoungus");
        map2.put("USA","Washington DC");
        map2.put("England", "London");

        HashMap<String, String> map3 = map;

        map3.putAll(map2);

        System.out.println(map3);


    }
}
