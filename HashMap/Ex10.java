package HashMap;

import java.util.HashMap;

public class Ex10 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("USA", "Washington DC");
        map.put("Norway", "Oslo");
        map.put("England", "London");
        map.put("Germany", "Berlin");

        String a = "England";
        if (map.containsKey(a)){
            System.out.println("Содержет "  + a);
        }else
            System.out.println("Не содержит " + a);

        System.out.println(map);
    }
}
