package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex23 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        List<String> array = new ArrayList<>();
        array = country;

        System.out.println(array);
    }
}
