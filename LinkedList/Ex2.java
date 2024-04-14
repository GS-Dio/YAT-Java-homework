package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

        country.addLast("USA");

        for (String str : country){
            System.out.println(str);
        }
    }
}
