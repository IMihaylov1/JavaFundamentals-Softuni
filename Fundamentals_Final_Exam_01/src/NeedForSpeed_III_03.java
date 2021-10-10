
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeed_III_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Integer> carsMileage = new TreeMap<>();
        TreeMap<String, Integer> carsFuel = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String[] currentCar = scanner.nextLine().split("\\|");
            String model = currentCar[0];
            int mileage = Integer.parseInt(currentCar[1]);
            int fuel = Integer.parseInt(currentCar[2]);

            carsMileage.put(model, mileage);
            carsFuel.put(model, fuel);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {

            String[] tokens = input.split(" : ");
            String command = tokens[0];
            String car = tokens[1];

            switch (command) {
                case "Drive": {
                    int distance = Integer.parseInt(tokens[2]);
                    int fuel = Integer.parseInt(tokens[3]);

                    int currentCarFul = carsFuel.get(car);
                    int leftFuel = currentCarFul - fuel;
                    if (leftFuel < 0) {
                        System.out.println("Not enough fuel to make that ride");
                        break;
                    } else {
                        int currentMileage = carsMileage.get(car);
                        carsMileage.put(car, currentMileage + distance);
                        carsFuel.put(car, leftFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }
                    int currentMileage = carsMileage.get(car);
                    if (currentMileage >= 100000) {
                        carsMileage.remove(car);
                        carsFuel.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                }
                break;
                case "Refuel": {
                    int fuel = Integer.parseInt(tokens[2]);
                    int maxFuel = 75;
                    int currentFuel = carsFuel.get(car);
                    int sumFuel = currentFuel + fuel;
                    if (sumFuel > 75) {
                        sumFuel = 75;
                        carsFuel.put(car, sumFuel);
                        System.out.printf("%s refueled with %d liters%n",car,maxFuel-currentFuel);
                    } else {
                        carsFuel.put(car, currentFuel + fuel);
                        System.out.printf("%s refueled with %d liters%n", car,fuel);
                    }
                }
                break;
                case "Revert": {
                    int km = Integer.parseInt(tokens[2]);
                    int currentMileage =carsMileage.get(car);
                    int mileageLeft = currentMileage-km;
                   if(mileageLeft<10000){
                       mileageLeft=10000;
                       carsMileage.put(car,mileageLeft);
                   }
                   System.out.printf("%s mileage decreased by %d kilometers%n",car,km);
                    carsMileage.put(car,mileageLeft);
                }
                break;
            }
            input = scanner.nextLine();
        }

//     "{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        carsMileage.entrySet()
                .stream()
                .sorted((c1,c2)-> c2.getValue().compareTo(c1.getValue()))
                .forEach(c-> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                        c.getKey(),c.getValue(),carsFuel.get(c.getKey())));
    }
}
