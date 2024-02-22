package Collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList<>();

        System.out.println("Введите 2 цвета:");
        colors.add(scanner.nextLine());

        System.out.println("Введите еще один:");
        colors.add(scanner.nextLine());

        System.out.println(colors);
    }
}
