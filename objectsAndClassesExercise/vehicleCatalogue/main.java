package vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!command.equals("End")) {

            String[] input = command.split("\\s+");
            vehicles.add(new Vehicle(input[0], input[1], input[2], Integer.parseInt(input[3])));

            command = scanner.nextLine();
        }
        String model = scanner.nextLine();
        double sumCar = 0;
        double sumTruck = 0;
        int countCar = 0;
        int countTruck = 0;
        while (!model.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);

                }
            }
            model = scanner.nextLine();
        }
        for (Vehicle vehicle : vehicles){
            if (vehicle.getType().equals("car")){
                sumCar+= vehicle.getHorsePower();
                countCar++;
            }else if (vehicle.getType().equals("truck")){
                sumTruck+= vehicle.getHorsePower();
                countTruck++;
            }
        }
        double averagePowerCars = sumCar / countCar;
        if (countCar== 0){
            averagePowerCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averagePowerCars);
        double averageTruck = sumTruck/countTruck;
        if (countTruck== 0){
            averageTruck = 0;

        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averageTruck);
    }
}