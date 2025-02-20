package stackify;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamSpecializations {
    public static void main(String[] args) {

        List<Employee> arrayOfEmps = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );

        // Creation
        // The most common way of creating an IntStream is to call mapToInt() on an existing stream:
        OptionalInt max = arrayOfEmps
                .stream()
                .mapToInt(employee -> (int) employee.getSalary())
                .max();
        System.out.println("Max Salary : "+max.getAsInt());
        System.out.println("----------------");

        // We can also use IntStream.of() for creating the IntStream:

            IntStream.of(1,2,3,4);

        // or IntStream.range():
        // This creates IntStream of numbers 10 to 19.
            IntStream.range(10, 20);

        // This returns a Stream<Integer> and not IntStream.
            Stream.of(1, 2, 3);


    }
}
