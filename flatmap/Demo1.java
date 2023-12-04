package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Map Vs FlatMap | Hands-On

public class Demo1 {
    public static void main(String[] args) {
        // map
        List<Integer> mapNumberList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> updatedMapNumberList = new ArrayList<>();

        updatedMapNumberList = mapNumberList.stream().map(numb -> numb + 10).collect(Collectors.toList());
        System.out.println(updatedMapNumberList);

        // flat-map
        List<Integer> flatMapNumberList1 = Arrays.asList(1, 2);
        List<Integer> flatMapNumberList2 = Arrays.asList(3, 4);
        List<Integer> flatMapNumberList3 = Arrays.asList(5, 6);

        List<List<Integer>> finalList = Arrays.asList(flatMapNumberList1, flatMapNumberList2, flatMapNumberList3);

        List<Integer> finalResultList = finalList
                .stream()
                .flatMap(strm -> strm.stream().map(x -> x*x))
                .collect(Collectors.toList());
        System.out.println(finalResultList);
    }
}
