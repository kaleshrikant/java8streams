package streammethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// sorted()

public class Demo1 {
    public static void main(String[] args) {
        
        List<Integer> numbersList = Arrays.asList(2,4,1,3,7,5,9);

        List<Integer> sortedNumbersListASC = numbersList.stream().sorted().collect(Collectors.toList());
            System.out.println("Sorted list in Ascending order : "+ sortedNumbersListASC);
        
        List<Integer> sortedNumbersListDESC = numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println("Sorted list in Decending order : "+ sortedNumbersListDESC);

    }
}