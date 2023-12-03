package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filtering out the even-numbers out of given list

public class FilterDemo1 {
    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> evenNumberList = new ArrayList<>();

        // without using streams
        for (int number : numbersList) {
            if (number % 2 == 0)
                evenNumberList.add(number);
        }
        System.out.println("Even Numbers : " + evenNumberList);

        // using streams
        evenNumberList = numbersList
                .stream()
                .filter(num -> (num % 2 == 0))
                .collect(Collectors.toList());
        System.out.println("Even Numbers : " + evenNumberList);

        // printing directly without storing to list
        numbersList
                .stream()
                .filter(num -> (num % 2 == 0))
                .forEach(printIt -> System.out.println(printIt));
        // using method referance
        numbersList
                .stream()
                .filter(num -> (num % 2 == 0))
                .forEach(System.out::println);
    }
}