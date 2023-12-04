package streammethods1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// distinct(), limit() --> #non-terminal
// count() --> #terminal

public class Demo1 {
    public static void main(String[] args) {

        List<String> vehicleList = Arrays.asList("bus", "car", "bike", "bicycle", "bus", "car", "bike");
        System.out.println("Vehicle List : " + vehicleList);

        // distinct
        List<String> distinctVehicleList = vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Vehicle List : " + distinctVehicleList);

        // count
        long countDistinctVehicleList = vehicleList.stream().distinct().count();
        System.out.println("Count of Distinct Vehicle List : " + countDistinctVehicleList);

        // limit
        List<String> limitedDistinctVehicleList = vehicleList.stream().distinct().limit(3).collect(Collectors.toList());
        System.out.println("3 Limited Distinct Vehicle List : " + limitedDistinctVehicleList);
    }
}
