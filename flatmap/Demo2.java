package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// FlatMap Method | Map Vs FlatMap | Hands-On

public class Demo2 {
    public static void main(String[] args) {
     
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
        List<String> teamC = Arrays.asList("Ken", "Johny", "Kitty");


        List<List<String>> playersInWorldCup = Arrays.asList(teamA, teamB, teamC);

            List<String> nameList = playersInWorldCup
                                                        .stream()
                                                        .flatMap(playerList -> playerList.stream())
                                                        .collect(Collectors.toList());
            System.out.println(nameList);
    }
}
