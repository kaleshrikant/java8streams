package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// calculate the lenth of each element and push to another collection.

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicleList = Arrays.asList("bus", "car", "bike", "bicycle", "flight", "train");
        List<Integer> vehicleLengthList = new ArrayList<>();

        vehicleLengthList = vehicleList
                                        .stream()
                                        .map(vehicle -> (vehicle.length()))
                                        .collect(Collectors.toList());
            System.out.println(vehicleLengthList);

        // or
                            vehicleList
                                        .stream()
                                        .map(vehicle -> (vehicle.length()))
                                        .forEach(System.out::print);
    }
}
