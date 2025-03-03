package stackify;
// joining : Collectors.joining() will insert the delimiter between the two String elements of the stream. It internally uses a java.util.StringJoiner to perform the joining operation.
// toSet : use toSet() to get a set out of stream elements
// toCollection : use Collectors.toCollection() to extract the elements into any other collection by passing in a Supplier<Collection>. We can also use a constructor reference for the Supplier
// summarizingDouble : summarizingDouble() is another interesting collector—which applies a double-producing mapping function to each input element and returns a special class containing statistical information for the resulting values
// partitioningBy : We can partition a stream into two—based on whether the elements satisfy certain criteria or not.
// groupingBy : groupingBy() offers advanced partitioning—where we can partition the stream into more than just two groups
// mapping : groups elements of the stream with the use of a Map.
// reducing : reducing() is similar to reduce(). It simply returns a collector which performs a reduction of its input elements:

import java.util.*;
import java.util.stream.Collectors;

public class AdvancedCollect {
    public static void main(String[] args) {

        List<Employee> arrayOfEmps = Arrays.asList(
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        );

        // joining
        String joingEmployees = arrayOfEmps
                                            .stream()
                                            .map(Employee::getEname)
                                            .collect(Collectors.joining(", "))
                                            .toString();
        System.out.println("String Joining Example : "+joingEmployees);
        System.out.println("------------------------");

        // toSet
        Set<Integer> toSetEmp = arrayOfEmps
                                            .stream()
                                            .map(Employee::getId)
                                            .collect(Collectors.toSet());
        System.out.println("String toSet Example : "+toSetEmp);
        System.out.println("------------------------");

        // toCollection
        Vector<Double> toVectorEmp = arrayOfEmps
                                                .stream()
                                                .map(Employee::getSalary)
                                                .collect(Collectors.toCollection(Vector::new));
        System.out.println("String toVector Example : "+toVectorEmp);
        System.out.println("------------------------");

        // summarizingDouble
        DoubleSummaryStatistics stats = arrayOfEmps.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Count : "+stats.getCount());
        System.out.println("Sum : "+stats.getSum());
        System.out.println("Min : "+stats.getMin());
        System.out.println("Max : "+stats.getMax());
        System.out.println("Average : "+stats.getAverage());
        System.out.println("------------------------");

        // partitioningBy
        // Here, the stream is partitioned into a Map, with even and odds stored as true and false keys.
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        java.util.Map isEven = (java.util.Map) intList
                        .stream()
                        .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Is Even : "+isEven);
        System.out.println("------------------------");

        // groupingBy
        java.util.Map<Character, List<Integer>> idGroupedByAlphabet = arrayOfEmps.stream().collect(
                Collectors.groupingBy(e -> Character.valueOf(e.getEname().charAt(0)),
                        Collectors.mapping(Employee::getId, Collectors.toList())));
        System.out.println("groupingBy : "+idGroupedByAlphabet);
        System.out.println("------------------------");

        // reducing
        Double percentage = 10.0;
        Double salIncrOverhead = arrayOfEmps.stream().collect(Collectors.reducing(
                0.0, e -> e.getSalary() * percentage / 100, (s1, s2) -> s1 + s2));
        System.out.println("reducing : "+salIncrOverhead);
        System.out.println("------------------------");
    }
}
