package Collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("cherry");
        list.add("banana");

        System.out.println("1" + list);
        Collections.shuffle(list);
        System.out.println("1" + list);
    }
}
