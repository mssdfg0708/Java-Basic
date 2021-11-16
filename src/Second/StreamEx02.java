package Second;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx02 {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 30, 10, 40, 2, 30};

        List<Integer> result = Arrays.stream(intArray).boxed().
                distinct().
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println(result);
    }
}
