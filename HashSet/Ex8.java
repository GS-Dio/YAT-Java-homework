package HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex8 {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();

        country.add("South Africa");
        country.add("Australia");
        country.add("India");

        TreeSet<String> treeSet = new TreeSet<>(country);

        System.out.println(treeSet);
    }
}
