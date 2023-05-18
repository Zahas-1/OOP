import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car ferrari = new Car(4, 4, "red", 1423.4);
        Car merc = new Car(4, 5, "white", 1983.23);
        Car threeWheels = new Car(3, 6, "green", 891.23);
        String carName = "Car Name:";
        merc.wheelMissing();

        System.out.println(carName + " Ferrari");
        System.out.println(ferrari.getWheels());
        System.out.println(ferrari.getColour());
        System.out.println(ferrari.getWeight());
        System.out.println(ferrari.getColour());

        List<Car> garage = new ArrayList<Car>();
        garage.add(ferrari);
        garage.add(merc);
        garage.add(threeWheels);

        for (int i = 0; i < garage.size(); i++) {
            System.out.println(garage.get(i));
        }

    }
}
