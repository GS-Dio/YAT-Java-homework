package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ex16 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        Collections.shuffle(country);

        System.out.println(country);
    }
}
