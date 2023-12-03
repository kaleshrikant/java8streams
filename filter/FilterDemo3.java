package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// filtering out the non-null words

public class FilterDemo3 {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("cup", null, "forest", "sky", "book", null, "theatre");
        List<String> resultList = new ArrayList<>();

        resultList = wordList
                .stream()
                .filter(word -> word != null)
                .collect(Collectors.toList());
        System.out.println("Non null List : " + resultList);
    }
}
