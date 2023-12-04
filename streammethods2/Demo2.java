package streammethods2;

import java.util.HashSet;
import java.util.Set;

// anyMatch(), allMatch(), noneMatch()

public class Demo2 {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();
            fruitSet.add("One apple");
            fruitSet.add("One mango");
            fruitSet.add("Two apples");
            fruitSet.add("More grapes");
            fruitSet.add("Two guavas");

        // anyMatch()
        boolean anyMatch = fruitSet.stream().anyMatch(fruit -> {
            return fruit.startsWith("One");
        });
        System.out.println("Any mathch with 'One' ? : "+anyMatch);

        // allMatch()
        boolean allMatch = fruitSet.stream().allMatch(fruit -> {
            return fruit.startsWith("One");
        });
        System.out.println("All mathch with 'One' ? : "+allMatch);

        // noneMatch
        boolean noneMatch = fruitSet.stream().noneMatch(fruit -> {
            return fruit.startsWith("One");
        });
        System.out.println("None mathch with 'One' ? : "+noneMatch);
    }
}
