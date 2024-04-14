package Collection2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        System.out.println(array);

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        array.set(2,a);

        System.out.println(array);


    }
}
