package Collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        List<int[]> arrays = new ArrayList<>();

        arrays.add(new int[]{1, 2, 3});
        arrays.add(new int[]{4, 5, 6, 7});
        arrays.add(new int[]{8, 9});

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какое число найти:");
        int a = scanner.nextInt();


        for(int[] array : arrays){
            for (int values : array){
                if (values == a){
                    System.out.println(a + " найден ");
                    break;
                }
            }
        }


    }
}
