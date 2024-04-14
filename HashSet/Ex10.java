package HashSet;

import java.util.HashSet;

public class Ex10 {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();

        country.add("South Africa");
        country.add("Australia");
        country.add("India");

        HashSet<String> country2 = new HashSet<>();

        country.add("South Africa2");
        country.add("Australia2");
        country.add("India2");

        if(country.equals(country2)){
            System.out.println("одинаковые");
        }else
            System.out.println("Не одинаковые");
    }
}
