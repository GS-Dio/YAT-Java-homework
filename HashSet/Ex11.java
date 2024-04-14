package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Ex11 {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();

        country.add("South Africa");
        country.add("Australia");
        country.add("India");

        HashSet<String> country2 = new HashSet<>();

        country.add("South Africa2");
        country.add("Australia");
        country.add("India2");

        HashSet<String> commonElements = new HashSet<>(country);
        commonElements.retainAll(country2);

        System.out.println("Одинаковые элементы: " + commonElements);

    }

}
