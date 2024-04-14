package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        country.addLast("USA");
        country.add(1,"Great");
        country.add(3,"Britan");

        System.out.println(country);

    }
}
