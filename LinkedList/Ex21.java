package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex21 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        String s = country.getLast();

        country.removeLast();

        System.out.println(s);
        System.out.println(country);
    }
}
