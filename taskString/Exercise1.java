package taskString;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        str = str.replace(".", "[.]");
        System.out.println(str);
    }

}

