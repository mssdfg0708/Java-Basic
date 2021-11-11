package Second;

import java.util.*;

public class TreeSetEx01 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(score[i]);
        }

        System.out.println("Less then 50 : " + set.headSet(50));
        System.out.println("More then 50 : " + set.tailSet(50));
    }
}
