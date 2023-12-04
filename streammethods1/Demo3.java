package streammethods1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// reduce ()

public class Demo3 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        Optional<String> reducedList = stringList.stream().reduce((value, combiner) -> {
            return value + combiner;
        });

        System.out.println("Reduced List is : " + reducedList.get());
    }
}
