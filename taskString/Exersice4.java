package taskString;

public class Exersice4 {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        int[] a = {1, 1, 1};
        printArray(findWordsContaining(words, x));
    }

    public static int[] findWordsContaining(String[] words, char x) {
        int[] a = new int[words.length];
        int temp = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                a[temp] = i;
                temp++;
            }
        }

        int[] b = new int[temp]; //Цикл копирует результат и хранит индекс слов имеющие символ х
        for (int i = 0; i < temp; i++){
            b[i] = a[i];
        }

        return b;
    }

    public static void printArray(int[] words) {
        System.out.print("[");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i != words.length - 1) {
                System.out.print(',');
            }
        }
        System.out.print("]");
    }
}
