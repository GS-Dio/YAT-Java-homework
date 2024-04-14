package Collection2;

import java.util.ArrayList;

public class Ex22 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);


        for(int i = 0; i < array.size(); i++) {
            System.out.println(i + 1 + ") "+ array.get(i));
        }
    }
}
