import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Car ferrari = new Car("ferrari", 4, 4, "red", 1423.4);
        Car merc = new Car("merc", 4, 5, "white", 1983.23);
        Car threeWheels = new Car("threeWheels", 3, 6, "green", 891.23);
        String carName = "Car Name:";
        merc.wheelMissing();

        List<Car> garage = new ArrayList<Car>();
        garage.add(ferrari);
        garage.add(merc);
        garage.add(threeWheels);

        while (true) {
            System.out.println("Enter car details: (No. of Wheels, Windows, colour and weight) ");
            int wheels = validateInput(scanner, "Number of wheels: ");
            int windows = validateInput(scanner, "Number of windows: ");
            String color = validateStringInput(scanner, "Colour of car: ");
            double weight = validateDoubleInput(scanner, "Weight of car: ");

            System.out.println("Enter car name: ");
            String name = scanner.next();

            Car newCar = new Car(name, wheels, windows, color, weight);
            garage.add(newCar);

            System.out.println("Do you want to add another car? (y/n)");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        for (int i = 0; i < garage.size(); i++) {
            Car car = garage.get(i);

            System.out.println(car.getName() + " " + " Specifications: ");
            System.out.println("Number of wheels: " + car.getWheels());
            System.out.println("Colour of car: " + car.getColour());
            System.out.println("Weight of car: " + car.getWeight());
            System.out.println("Number of windows" + car.getWindows());
            System.out.println();

        }

    }

    public static int validateInput(Scanner scanner, String message) {
        int value;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter only an integer: ");
                scanner.next();
            }
        }
        return value;
    }

    public static double validateDoubleInput(Scanner scanner, String message) {
        double value;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter only an integer: ");
                scanner.next();
            }
        }
        return value;
    }

    public static String validateStringInput(Scanner scanner, String message) {
        String value;
        while (true) {
            System.out.println(message);
            if (scanner.hasNext()) {
                value = scanner.next();
                break;
            } else {
                System.out.println("Invalid input. Please enter only an integer: ");
                scanner.next();
            }
        }
        return value;
    }
}




