package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// mutiple condion in filter
public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Melisandre", "Sansa", "Ron", "Daenerys", "Joffery");
        List<String> longNamesList = new ArrayList<>();

        // using collect()
        longNamesList = namesList
                .stream()
                .filter(str -> (str.length() > 6 && str.length() < 8))
                .collect(Collectors.toList());
        System.out.println(longNamesList);

        // using for each
        namesList
                .stream()
                .filter(str -> (str.length() > 6 && str.length() < 8)).forEach(nM -> System.out.println(nM));

        // using method referance
        namesList
                .stream()
                .filter(str -> (str.length() > 6 && str.length() < 8)).forEach(System.out::print);

    }
}
