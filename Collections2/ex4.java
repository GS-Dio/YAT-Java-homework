package Collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        System.out.print("Какой по счету элемент вывести: ");
        int index = scanner.nextInt() - 1;
        System.out.println(colors.get(index));
    }
}
