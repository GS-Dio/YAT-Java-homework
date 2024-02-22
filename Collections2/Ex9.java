package Collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("cherry");
        list.add("banana");

        System.out.println("1" + list);

        List<String> list2 = new ArrayList<>();
        list2.addAll(list);

        System.out.println("2" + list2);
    }
}
