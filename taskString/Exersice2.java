package taskString;

import java.util.Scanner;

public class Exersice2 {
    public static void main(String[] args) {
        String[] strArray = {"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(strArray));
    }

    public static int finalValueAfterOperations(String[] operations) {
        String[] str = operations;
        int temp = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("X++")) {
                temp += 1;
            } else if (str[i].equals("++X")) {
                temp += 2;
            } else if (str[i].equals("X--")) {
                temp -= 1;
            } else if (str[i].equals("--X")) {
                temp -= 1;
            }
        }
        return temp;
    }
}

