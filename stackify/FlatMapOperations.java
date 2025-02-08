package stackify;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * flatMapToInt
 * flatMapToLong
 * flatMapToDouble

* These operations are used when each element of a stream should be mapped to a stream of primitive values
 * (IntStream, LongStream, or DoubleStream). They flatten the resulting streams into a single stream.
* */

public class FlatMapOperations {
    public static void main(String[] args) {

        // flatMapToInt : In this example, each string containing numbers separated by commas is split, parsed into integers, and flattened into a single IntStream.
        Stream<String> strings = Stream.of("1,2,3", "4,5");
        IntStream intStream = strings.flatMapToInt(s -> Arrays.stream(s.split(","))
                .mapToInt(Integer::parseInt));
        intStream.forEach(System.out::println);

        // flatMapToLong
        Stream<String> strings1 = Stream.of("10000000000,20000000000", "30000000000");
        LongStream longStream = strings1.flatMapToLong(s -> Arrays.stream(s.split(","))
                .mapToLong(Long::parseLong));
        longStream.forEach(System.out::println);

        // flatMapToDouble
        Stream<String> strings2 = Stream.of("1.1,2.2", "3.3,4.4");
        DoubleStream doubleStream = strings2.flatMapToDouble(s -> Arrays.stream(s.split(","))
                .mapToDouble(Double::parseDouble));
        doubleStream.forEach(System.out::println);

    }
}
