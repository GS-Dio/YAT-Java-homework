package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex15 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        System.out.println(country);

        String temp = country.get(3);
        country.set(3, country.getFirst());
        country.set(0,temp);

        System.out.println(country);
    }
}
