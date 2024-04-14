package Collection2;

import java.util.ArrayList;
import java.util.List;

public class Ex14 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        String red = "red";
        String green = "green";
        String yellow = "yellow";
        String blue = "blue";

        colors.add(red);
        colors.add(green);
        colors.add(yellow);
        colors.add(blue);

        System.out.println(colors);

        String bob = colors.get(0);
        colors.set(0,colors.get(3));
        colors.set(3,bob);

        System.out.println(colors);

    }
}
