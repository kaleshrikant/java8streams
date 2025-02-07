package stackify;

/*
    A stream can hold complex data structures like Stream<List<String>>.
    In cases like this, flatMap() helps us to flatten the data structure
    to simplify further operations:
*/

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> collected = namesNested
                                            .stream()
                                            .flatMap(Collection::stream)
                                            .collect(Collectors.toList());
        collected.stream().forEach(System.out::println);
    }
}
