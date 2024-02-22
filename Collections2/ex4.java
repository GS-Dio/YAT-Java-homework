package Collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("blue");

        System.out.println(colors);

        System.out.print("Изменить первый элемент на: ");
        colors.set(0,scanner.nextLine());

        System.out.println(colors);
    }
}
