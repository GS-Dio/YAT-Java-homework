package Collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        System.out.print("Найти элемент со значением: ");
        int element = scanner.nextInt();

        for (int i = 0; i < nums.size();i++){
            if (element == nums.get(i))
                System.out.print("Элемент " + element + " находится по индексу " + i );
        }

    }
}
