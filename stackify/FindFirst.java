package stackify;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Employee> arrayOfEmps = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );

        Optional<Employee> findFirst = arrayOfEmps.stream().filter(employee -> employee.getSalary() > 10000).findFirst();
        System.out.println(findFirst.get());
    }
}
