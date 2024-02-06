package taskString;

public class Exersice3 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelsChar = jewels.toCharArray();
        char[] stonesChar = stones.toCharArray();
        int temp = 0;

        for (int i = 0; i < stones.length(); i++) {
            for(int j = 0; j < jewelsChar.length; j++) {
                if (stonesChar[i] == jewelsChar[j] ) {
                    temp++;
                }
            }
        }
        return temp;
    }
}

