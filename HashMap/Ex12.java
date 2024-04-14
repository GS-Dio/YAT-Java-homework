package HashMap;

import java.util.Collection;
import java.util.HashMap;

public class Ex12 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("USA", "Washington DC");
        map.put("Norway", "Oslo");
        map.put("England", "London");
        map.put("Germany", "Berlin");

        Collection<String> values = map.values();
        
        for (String value : values) {
            System.out.println(value);
        }


    }
}
