package HashSet;

import java.util.HashSet;

public class Ex6 {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();

        country.add("South Africa");
        country.add("Australia");
        country.add("India");

        HashSet<String> country2 = country;

        System.out.println(country2);
    }
}
