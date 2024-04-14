package HashSet;

import java.util.HashSet;

public class Ex3 {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();

        country.add("South Africa");
        country.add("Australia");
        country.add("India");

        System.out.println(country.size());
    }
}
