package Second;

import java.util.*;

public class HashSetEx01 {
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 3, 3, 4, 2, 5, 1, 5, 6, 9, 7, 8, 0, 7, 8, 7,9};
        Set set = new HashSet();
        LinkedHashSet linkedSet = new LinkedHashSet();
        TreeSet treeSet = new TreeSet();

        for (int item : inputArray) {
            set.add(item);
            linkedSet.add(item);
            treeSet.add(item);
        }
        System.out.println(set);
        System.out.println(linkedSet);
        System.out.println(treeSet);
        System.out.println(treeSet.subSet(3, 7));
    }
}
