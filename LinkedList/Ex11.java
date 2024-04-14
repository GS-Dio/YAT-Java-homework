package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        country.addLast("USA");

        for (int i = 0; i < country.size(); i++){
            System.out.println(i + 1 + ". " + country.get(i));
        }
    }
}
