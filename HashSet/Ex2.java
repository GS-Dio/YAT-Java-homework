package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();

        country.add("South Africa");
        country.add("Australia");
        country.add("India");

        Iterator<String> iterator = country.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
