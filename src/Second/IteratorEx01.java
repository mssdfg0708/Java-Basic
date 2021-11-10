package Second;

import java.util.*;

public class IteratorEx01 {
    public static void main(String[] args) {
        LinkedList numberList = new LinkedList();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        System.out.println("Using Iterator");
        Iterator iterator = numberList.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.print(object + " ");
        }

        System.out.println();
        System.out.println("Enhanced For Loop");
        for (Object object : numberList) {
            System.out.print(object + " ");
        }

        System.out.println();
        System.out.println("Using listIterator");
        ListIterator listIterator = numberList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

        System.out.println();
        System.out.println("Remove Sequence");
        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            if ((int)element == 2)
                continue;
            System.out.println("Remove : " + element);
            listIterator.remove();
        }
        System.out.print("Print List : ");
        for (Object object : numberList) {
            System.out.print(object + " ");
        }
    }
}
