package HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex9 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(7);

        for (int a : treeSet){
            if (a < 7){
                System.out.println(a);
            }
        }

        System.out.println(treeSet);
    }
}
