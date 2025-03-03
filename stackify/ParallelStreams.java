package stackify;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            numbers
                .parallelStream()
                // Filter even numbers
                .filter(n -> n % 2 == 0)
                // Print each number
                .forEach(System.out::println);

    }
}
