package Collection2;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        String red = "red";
        String green = "green";
        String yellow = "yellow";

        colors.add(red);
        colors.add(green);
        colors.add(yellow);

        System.out.println(colors);
    }
}
