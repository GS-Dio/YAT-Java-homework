package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex4 {
    public static void main(String[] args) {
        List<String> country = new LinkedList<>();

        country.add("France");
        country.add("Great");
        country.add("Britan");
        country.add("Italy");

      for (int i = 0; i < country.size(); i++){
          System.out.println(country.get(country.size() - i - 1) );
      }
    }
}
