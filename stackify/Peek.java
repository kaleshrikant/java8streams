package stackify;

import java.util.Arrays;
import java.util.List;

/*
* Sometimes we need to perform multiple operations on each element of the stream before any terminal operation is applied.
* Simply put, it performs the specified operation on each element of the stream and returns a new stream that can be used further.
* This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline“.
* peek() is an intermediate operation:
* */
public class Peek {
    public static void main(String[] args) {

        List<Employee> arrayOfEmps = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );

        arrayOfEmps
                    .stream()
                    .filter(employee -> employee.getSalary() > 20000)
                    .peek(System.out::println)
                    .map(employee -> employee.getEname().toUpperCase())
                    .peek(System.out::println)
                    .forEach(System.out::println);
    }
}
