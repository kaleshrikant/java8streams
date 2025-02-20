package stackify;

/*
 Reduce :
    Used to perform a reduction on the elements of a stream using an associative accumulation function and returns an Optional.
    It is commonly used to aggregate or combine elements into a single result, such as computing the maximum, minimum, sum, or product.
 Syntax :  T reduce(T identity, BinaryOperator<T> accumulator);
    identity: An initial value of type T.
    accumulator: A function that combines two values of type T.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Reduce {
    public static void main(String[] args) {
        // Example 1: Get the Longest String
        List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
        Optional<String> logestString = words
                                            .stream()
                                            .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
        System.out.print("Longest String : \t");
        logestString.ifPresent(System.out::println);
        System.out.println("-----------");

        // Example 2: Combine Strings
        String[] array = { "Geeks", "for", "Geeks" };
        Optional<String> combinedString = Arrays.stream(array).reduce((word1, word2) -> word1 + word2);
        System.out.print("combinedString String : \t");
        combinedString.ifPresent(System.out::println);
        System.out.println("-----------");

        // Example 3: Sum of All Elements
        List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);
        Optional<Integer> sumOfAllElements = numbers.stream().reduce((number1, number2) -> number1 + number2);
        System.out.print("sum Of All Numbers  : \t");
        sumOfAllElements.ifPresent(System.out::println);
        System.out.println("-----------");

        // Example 4: Product of All Numbers in a Range
        int product = IntStream.range(2, 8)
                                .reduce((num1, num2) -> num1 * num2)
                                .orElse(-1); // Provides -1 if the stream is empty
        System.out.println("The product is : " + product);
        System.out.println("-----------");
    }
}
