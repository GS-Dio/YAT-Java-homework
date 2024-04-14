package HashMap;

import java.util.HashMap;

public class Ex8 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("USA", "Washington DC");
        map.put("Norway", "Oslo");
        map.put("England", "London");
        map.put("Germany", "Berlin");

        String a = "Oslo";
        if (map.containsValue(a)){
            System.out.println("Содержет "  + a);
        }else
            System.out.println("Не содержет " + a);

        System.out.println(map);
    }
}
