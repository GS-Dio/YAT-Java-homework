package Collection2;

import java.util.ArrayList;
import java.util.List;

public class Ex19 {
    public static void main(String[] args) {

        ArrayList<Integer>  array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        System.out.println(array.size());

        array.trimToSize();

        System.out.println(array.size());
    }
}
