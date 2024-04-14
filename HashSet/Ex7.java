package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();

        country.add("South Africa");
        country.add("Australia");
        country.add("India");

        List<String> arr = new ArrayList<>();
        arr = country.stream().toList();

        System.out.println(arr);
    }
}
