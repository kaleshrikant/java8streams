package stackify;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/*
* MapToInt
* MapToLong
* MapToDouble
 */
public class MapOperations {
    public static void main(String[] args) {

        // mapToInt : converts a list of strings to an IntStream of integers.
        List<String> numbersAsString = Arrays.asList("10000000000", "20000000000");
        LongStream longStream = numbersAsString
                .stream()
                .mapToLong(Long::parseLong);
        longStream.forEach(System.out::println);
        System.out.println("-----");

        // mapToLong : Here, each string is parsed into a long value, producing a LongStream.
        List<String> numbersAsString1 = Arrays.asList("10000000000", "20000000000");
        LongStream longStream1 = numbersAsString1.stream()
                .mapToLong(Long::parseLong);
        longStream1.forEach(System.out::println);
        System.out.println("-----");

        // mapToDouble : This operation converts strings to a DoubleStream of floating-point numbers.
        List<String> numbersAsString2 = Arrays.asList("1.5", "2.5", "3.5");
        DoubleStream doubleStream = numbersAsString.stream()
                .mapToDouble(Double::parseDouble);
        doubleStream.forEach(System.out::println);
    }
}
