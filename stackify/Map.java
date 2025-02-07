package stackify;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* map() produces a new stream after applying a function to each element of the original stream.
The new stream could be of a different type.  */

public class Map {
    public static void main(String[] args) {

        List<Employee> arrayOfEmps = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );

        System.out.println("Before Bonus Employee Salary : "+arrayOfEmps);
        // bonus
        List<Double> bonusEmployee = arrayOfEmps.stream().map(employee -> employee.getSalary() + 1000).collect(Collectors.toList());
        System.out.print("After Bonus Employee Salary : ");
        bonusEmployee.stream().forEach(System.out::println);


    }
}
