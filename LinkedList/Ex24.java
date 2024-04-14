package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex24 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        List<String> city = new LinkedList<>();

        city.add("Almaty");
        city.add("Taraz");
        city.add("Moscow");

        country.addAll(city);

        if(country.equals(city)){
            System.out.println("Одинаково");
        } else
            System.out.println("Не одинаково");

    }
}
