package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        int sumCarsHorsePower = 0;
        int sumTruckHorsePower = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String currentType = tokens[0];
            String currentModel = tokens[1];
            String currentColor = tokens[2];
            int currentHorsePower = Integer.parseInt(tokens[3]);

            if (currentType.equals("car")) {
                Car car = new Car(currentType, currentModel, currentColor, currentHorsePower);
                cars.add(car);
                sumCarsHorsePower += currentHorsePower;
            } else {
                Truck truck = new Truck(currentType, currentModel, currentColor, currentHorsePower);
                trucks.add(truck);
                sumTruckHorsePower += currentHorsePower;
            }

            command = scanner.nextLine();
        }
        String input = scanner.nextLine();
        List<String> modelsForPrinting = new ArrayList<>();
        while (!"Close the Catalogue".equals(input)) {
            for (Car car : cars) {
                if (car.getModel().equals(input)) {
                    System.out.println(car);
                    break;
                }
            }
                for (Truck truck : trucks) {
                    if (truck.getModel().equals(input)) {
                        System.out.println(truck);
                        break;
                    }
                }
                input = scanner.nextLine();
            }
        double avgCar = 0;
        if (cars.size() != 0) {
            avgCar = 1.0 * sumCarsHorsePower / cars.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCar);
        double avgTruck = 0;

        if (trucks.size() != 0) {
            avgTruck = 1.0 * sumTruckHorsePower / trucks.size();
        }
        System.out.printf("Trucks have average horsepower of: %.2f.", avgTruck);
    }
}
