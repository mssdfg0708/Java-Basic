package Second;

import java.util.*;

public class LinkedListEx01 {
    static void print(LinkedList arr01, LinkedList arr02) {
        System.out.println("numberList : " + arr01);
        System.out.println("subNumberList : " + arr02);
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList numberList = new LinkedList();
        numberList.add(1);
        numberList.add(3);
        numberList.add(5);
        numberList.add(7);
        numberList.add(9);
        numberList.add(0);
        numberList.add(2);
        numberList.add(4);
        numberList.add(6);
        numberList.add(8);
        LinkedList subNumberList = new LinkedList(numberList.subList(3,7));
        print(numberList, subNumberList);

        Collections.sort(numberList);
        Collections.sort(subNumberList);
        print(numberList, subNumberList);

        subNumberList.add(20);
        subNumberList.add(0, 25);
        print(numberList, subNumberList);

        System.out.println("Delete numberList elements which is in subNumberList : " +
                numberList.retainAll(subNumberList));
        print(numberList, subNumberList);

        System.out.println("Delete subNumberList elements which is in numberList");
        for (int i =  subNumberList.size() - 1; i >= 0; i--) {
            if(numberList.contains(subNumberList.get(i))){
                subNumberList.remove(i);
            }
        }
        print(numberList, subNumberList);

        subNumberList.clear();
        print(numberList, subNumberList);

        ArrayList arrayList = new ArrayList(numberList);
        System.out.println("arrayList : " + arrayList);
    }
}
