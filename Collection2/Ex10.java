package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex10 {
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

        Collections.shuffle(colors);

        System.out.println(colors);

    }
}
