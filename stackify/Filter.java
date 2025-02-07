package stackify;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        List<Employee> arrayOfEmps = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );

        // filtering employee having salary greater than 20K

        List<Employee> salaryEmply = arrayOfEmps
                                                .stream()
                                                .filter(employee -> employee.getSalary() > 20000)
                                                .collect(Collectors.toList());
        System.out.println(salaryEmply);

    }
}
