package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex22 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        if (country.contains("France")){
            System.out.println("Да содержит");
        } else
            System.out.println("Нет не содержит");
    }
}
