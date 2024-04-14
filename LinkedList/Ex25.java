package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex25 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        if (country.isEmpty()){
            System.out.println("Он пустой");
        } else
            System.out.println("Не пустой");

        System.out.println(country);
    }
}
