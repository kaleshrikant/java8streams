package streammethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// findAny(), findFirst()

public class Demo3 {
    public static void main(String[] args) {
        
        List<String> stringsList = Arrays.asList("One", "Two", "Three", "One");
        
        // findAny
       Optional<String> findAny = stringsList.stream().findAny();
            System.out.println("What have you found ? : "+findAny.get());

        // findFirst
        Optional<String> findFirst = stringsList.stream().findFirst();
            System.out.println("What have you found at first ? : "+findFirst.get());

    }    
}
