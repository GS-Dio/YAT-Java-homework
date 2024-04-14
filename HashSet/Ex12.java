package HashSet;

import java.util.HashSet;

public class Ex12 {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();

        country.add("South Africa");
        country.add("Australia");
        country.add("India");

        country.clear();

        System.out.println(country);
    }
}
