
package stackify;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    private static List<Employee> empList = Arrays.asList(arrayOfEmps);

    public static void main(String[] args) {
        // We can also obtain a stream from an existing list:
        empList.stream();

        // obtain a stream from an existing array:
        Stream.of(arrayOfEmps);

        // And we can create a stream from individual objects using Stream.of():
        Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

        // Or simply using Stream.builder():
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();
            empStreamBuilder.accept(arrayOfEmps[0]);
            empStreamBuilder.accept(arrayOfEmps[1]);
            empStreamBuilder.accept(arrayOfEmps[2]);


    }
}