package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        country.addLast("USA");

        System.out.println(country.getFirst() + " " + country.getLast());
    }
}
