package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");
        country.addLast("USA");

        for (int i = 2; i < country.size(); i++){
            System.out.println(country.get(i));
        }
    }
}
