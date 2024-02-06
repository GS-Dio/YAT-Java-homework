package taskString;

public class Exersice7 {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arraysEquivalent(word1, word2));

    }

    public static boolean arraysEquivalent(String[] str1, String[] str2) {
        String first = "";
        String second = "";
        for (int i = 0; i < str1.length; i++) {
            first += str1[i];
        }
        for (int i = 0; i < str2.length; i++) {
            second += str2[i];
        }

        boolean a = first.equals(second);
        return a;
    }
}
