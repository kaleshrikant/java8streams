package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicleList = Arrays.asList("bus", "car", "bike", "bicycle", "flight", "train");
        List<String> vehicleListInUpperCase = new ArrayList<>();

            // without using streams concept
        for (String vehicle : vehicleList) {
            vehicle.toUpperCase();
            vehicleListInUpperCase.add(vehicle);
        }

            // using streams --> map concept
           vehicleListInUpperCase = vehicleList
                                                .stream()
                                                .map(vehicle -> (vehicle.toUpperCase()))
                                                .collect(Collectors.toList());
                System.out.println(vehicleListInUpperCase);

    }
}
