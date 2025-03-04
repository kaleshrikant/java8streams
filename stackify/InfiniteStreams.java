package stackify;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Sometimes, we might want to perform operations while the elements are still getting generated.
    We might not know beforehand how many elements we’ll need.
    Unlike using list or map, where all the elements are already populated,
    we can use infinite streams, also called unbounded streams.

    There are two ways to generate infinite streams:

 generate : We provide a Supplier to generate() which gets called whenever new stream elements need to be generated
 iterate : iterate() takes two parameters: an initial value, called the seed element and a function that generates the next element using the previous value. By design, iterate() is stateful and hence may not be useful in parallel streams
 */
public class InfiniteStreams {
    public static void main(String[] args) {

        // generate
        System.out.println("generate : ");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
        System.out.println("---------------------");

        // iterate
        Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);

        List<Integer> collect = evenNumStream
                                            .limit(5)
                                            .collect(Collectors.toList());
        System.out.println("iterate : "+collect);
        System.out.println("---------------------");
    }
}
