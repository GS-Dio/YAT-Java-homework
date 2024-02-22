package Collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> colors = new ArrayList<>();

        System.out.println("Введите 2 цвета:");
        colors.add(scanner.nextLine());

        System.out.println("Введите еще один:");
        colors.add(scanner.nextLine());

        Iterator<String> iterators = colors.iterator();

        System.out.println("Итератторы:");
        while(iterators.hasNext()){
            System.out.println(iterators.next());
        }
    }
}


