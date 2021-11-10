package Second;

import java.util.*;

public class ArrayListEx02 {
    public static void main(String[] args) {
        final int Unit = 10;
        String source = "0123456789ABCDEFGHKMabcdefghkm!@#$%^&*()EOF";
        int sourceLength = source.length();

        List list = new ArrayList(sourceLength/Unit + 1);

        for (int i = 0; i < sourceLength; i+=Unit) {
            if (i + Unit < sourceLength)
                list.add(source.substring(i, i + Unit));
            else
                list.add(source.substring(i));
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
