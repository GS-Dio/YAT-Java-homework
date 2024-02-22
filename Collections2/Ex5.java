package Collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("blue");

        System.out.println(colors);

        System.out.print("Какой по счету элемент на black: ");
        colors.set(scanner.nextInt() - 1,"Black");

        System.out.println(colors);
    }
}
