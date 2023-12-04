package streammethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// concat()

public class Demo4 {
    public static void main(String[] args) {

        List<String> animalList = Arrays.asList("Dog", "Cat", "Elephant");
        List<String> birdList = Arrays.asList("Peacock", "Parrot", "Crow");

        Stream<String> animalStream = animalList.stream();
        Stream<String> birdStream = birdList.stream();

        List<String> finalListStream = Stream.concat(animalStream, birdStream).collect(Collectors.toList());

        for (String item : finalListStream) {
            System.out.println(item);
        }
    }
}