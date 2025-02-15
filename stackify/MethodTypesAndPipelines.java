package stackify;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodTypesAndPipelines {
    public static void main(String[] args) {

        List<Employee> arrayOfEmps = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );

        // intermediate and terminal operations
        // filter() is the intermediate operation and count is the terminal operation
            long count = arrayOfEmps
                                    .stream()
                                    .filter(employee -> employee.getSalary() > 20000)
                                    .count();
            System.out.println("Count : "+count);
            System.out.println("-------------------------");

            // short-circuiting operations.
            // Short-circuiting operations allow computations on infinite streams to be completed in finite time
            // Here, we use short-circuiting operations skip() to skip first three elements, and limit() to limit to five elements from the infinite stream generated using iterate().
                Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);
                List<Integer> collect = infiniteStream
                                                        .skip(3)
                                                        .limit(5)
                                                        .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("-------------------------");
        // Lazy Evaluation
        // Note : All intermediate operations are lazy, so they’re not executed until a result of processing is needed.
            Integer[] empIds = { 1, 2, 3, 4 };
            Integer i = Arrays
                                .stream(empIds)
                                .filter(empId -> empId % 2 == 0)
                                .findFirst()
                                .orElse(null);
            System.out.println("Find First : "+i);

    }
}
