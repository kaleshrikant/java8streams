package stackify;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 *  Introduced in Java 9, the mapMulti methods provide a powerful way to perform multi-level mappings, allowing you to handle more complex transformations that yield multiple results from a single input element. 
 *  mapMultiToInt, mapMultiToLong, and mapMultiToDouble
 */

public class AdvancedMapping {

    public static void main(String[] args) {
        
        // mapMulti : ntroduced in Java 9, the mapMulti methods provide a powerful way to perform multi-level mappings, allowing you to handle more complex transformations that yield multiple results from a single input element.

        Stream.of(1, 2, 3).<String>mapMulti((number, consumer) -> {
            consumer.accept(number + "a");
            consumer.accept(number + "b");
          }).forEach(System.out::println);
        System.out.println("-----------------");

        // mapMultiToInt : Similar to mapMulti but for IntStream.
        // This example splits each string and maps them to integers, collecting them into an IntStream.
        Stream.of("1,2", "3,4").mapMultiToInt((s, consumer) -> {
        Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).forEach(consumer);
            }).forEach(System.out::println);
        System.out.println("-----------------");


        // mapMultiToLong : Used for generating a LongStream.
        // It splits strings and maps the parts to a LongStream.
        Stream.of("10000000000,20000000000").mapMultiToLong((s, consumer) -> {
            Arrays.stream(s.split(",")).mapToLong(Long::parseLong).forEach(consumer);
          }).forEach(System.out::println);
        System.out.println("-----------------");

        // mapMultiToDouble : For creating a DoubleStream.
        // Here, each input string is split and converted into a DoubleStream.
        Stream.of("1.1,2.2").mapMultiToDouble((s, consumer) -> {
            Arrays.stream(s.split(",")).mapToDouble(Double::parseDouble).forEach(consumer);
          }).forEach(System.out::println);
        System.out.println("-----------------");

        

    }
    
}
