package Collections2;

import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("cherry");
        list.add("banana");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
