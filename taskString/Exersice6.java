package taskString;

public class Exersice6 {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too","this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int[] sentencesArr = new int[sentences.length];
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String temp = sentences[i];
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == ' ') {
                    sentencesArr[i]++;
                }
            }
        }

        for (int i = 0; i < sentencesArr.length - 1; i++) {
            if (sentencesArr[i] >= sentencesArr[i + 1]) {
                max = sentencesArr[i];
            } else
                max = sentencesArr[i + 1];
        }

        return max + 1;
    }
}
