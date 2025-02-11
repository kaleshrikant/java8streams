package stackify;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
* sorted
* min and max
* distinct
* allMatch, anyMatch, and noneMatch : These operations all take a predicate and return a boolean. Short-circuiting is applied and processing is stopped as soon as the answer is determined:
*/

public class ComparisonBasedStreamOperations {
    public static void main(String[] args) {

        List<Employee> arrayOfEmps = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0),
                new Employee(4, "Mark Zuckerberg", 300000.0)
        );

        // sorted
        // sort ename by decending order
        List<Employee> collectedDecending = arrayOfEmps
                                                        .stream()
                                                        .sorted((employee1, employee2) -> employee2.getEname().compareTo(employee1.getEname()))
                                                        .collect(Collectors.toList());
        collectedDecending.stream().forEach(System.out::println);
        System.out.println("---------------------");

        // min and max
        // based on salary
        Optional<Employee> min = arrayOfEmps
                               .stream()
                               .min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Minimum Salaried Employee : "+ min.get());

        Optional<Employee> max = arrayOfEmps.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Maximum Salaried Employee : "+ max.get());
        System.out.println("---------------------");

        // distinct
        List<Employee> distinctEmployees = arrayOfEmps.stream().distinct().collect(Collectors.toList());
        System.out.println("List of distinct employees :");
        distinctEmployees.stream().forEach(System.out::println);
        System.out.println("---------------------");

        // allMatch, anyMatch, and noneMatch
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
            // allMatch() checks if the predicate is true for all the elements in the stream. Here, it returns false as soon as it encounters 5, which is not divisible by 2.
        boolean allEven = intList.stream().allMatch(integer -> integer%2==0);
            // anyMatch() checks if the predicate is true for any one element in the stream. Here, again short-circuiting is applied and true is returned immediately after the first element.
        boolean oneEven = intList.stream().anyMatch(integer -> integer%2==0);
            // noneMatch() checks if no elements are matching the predicate. Here, it simply returns false as soon as it encounters 6, which is divisible by 3.
        boolean noneMultipleOfThree = intList.stream().noneMatch(integer -> integer%3==0);

        System.out.println("allEven : "+allEven);
        System.out.println("oneEven : "+oneEven);
        System.out.println("noneMultipleOfThree : "+noneMultipleOfThree);

    }
}
