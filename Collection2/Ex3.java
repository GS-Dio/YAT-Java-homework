package Collection2;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        String red = "red";
        String green = "green";
        String yellow = "yellow";

        colors.add(red);
        colors.add(green);
        colors.add(yellow);

        System.out.println(colors);

        String blue = "blue";

        colors.add(0,blue);

        System.out.println(colors);
    }
}
