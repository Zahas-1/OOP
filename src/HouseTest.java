import java.util.ArrayList;
public class HouseTest {
    public static void main(String[] args) {
        House house1 = new House(10, "Blue", 12, "Black", false, false);
        House house2 = new House(5, "White", 5, "White", true, false);
        House house3 = new House(15, "Black", 7, "Black", true, true);
        House house4 = new House(0,"None", 0, "None", false, false);

        ArrayList<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        houseList.add(house4);

        for (int i = 0; i < houseList.size(); i++) {
            House house = houseList.get(i);

            System.out.println("House " + (i + 1) + " Details:");
            System.out.println("Doors: " + house.getDoors());
            System.out.println("Door Color: " + house.getDoorColor());
            System.out.println("Windows: " + house.getWindows());
            System.out.println("Window Color: " + house.getWindowColor());
            System.out.println("Has Driveway: " + house.getHasDriveway());
            System.out.println("Has Garden: " + house.getHasGarden());
            System.out.println();
            
        }

    }
}
