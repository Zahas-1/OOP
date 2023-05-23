import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car ferrari = new Car(4, 4, "red", 1423.4);
        Car merc = new Car(4, 5, "white", 1983.23);
        Car threeWheels = new Car(3, 6, "green", 891.23);
        String carName = "Car Name:";
        merc.wheelMissing();

        List<Car> garage = new ArrayList<Car>();
        garage.add(ferrari);
        garage.add(merc);
        garage.add(threeWheels);

        for (int i = 0; i < garage.size(); i++) {
            Car car = garage.get(i);

            System.out.println(carName + (i + 1) + " Specifications: ");
            System.out.println("Number of wheels: " + car.getWheels());
            System.out.println("Colour of car: " + car.getColour());
            System.out.println("Weight of car: " + car.getWeight());
            System.out.println("Number of windows" + car.getWindows());
            System.out.println();

        }

    }
}
