package Collection2;

import java.util.ArrayList;

public class Ex20 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        System.out.println(array.size());

        array.ensureCapacity(100);

//        System.out.println(array.capacity());
    }
}
