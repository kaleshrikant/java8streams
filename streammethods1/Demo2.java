package streammethods1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// count() --> #terminal
// min(), max() --> #non-terminal

public class Demo2 {
    public static void main(String[] args) {

        // count
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long countEvenNumbers = numbersList.stream().filter(even -> even % 2 == 0).count();
        System.out.println(countEvenNumbers);

        // min
        Optional minNumber = numbersList.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println("Minimal number from list : " + minNumber.get());

        // max
        Optional maxNumber = numbersList.stream().max((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println("Maximum number from list : " + maxNumber.get());
    }
}
