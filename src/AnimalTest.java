import java.sql.SQLOutput;

public class AnimalTest {
    public static void main(String[] args) {
        Animal giraffe = new Animal("Jungle", "Mammal", "Brown", 1005.00);
        Animal dolphin = new Animal("Ocean", "Mammal", "Blue", 90);
        Animal snake = new Animal("Forest", "Reptile", "Green", 20);
        Animal fish = new Animal("River", "Fish", "Orange", 3);

        System.out.println("Giraffe");
        System.out.println("Habitat: " + giraffe.getHabitat());
        System.out.println("Species: " + giraffe.getSpecies());
        System.out.println("Color: " + giraffe.getColor());
        System.out.println("Weight: " + giraffe.getWeight() + "lbs");
        System.out.println();
        System.out.println("Dolphin");
        System.out.println("Habitat: " + dolphin.getHabitat());
        System.out.println("Species: " + dolphin.getSpecies());
        System.out.println("Color: " + dolphin.getColor());
        System.out.println("Weight: " + dolphin.getWeight() + "lbs");
        System.out.println();
        System.out.println("Snake");
        System.out.println("Habitat: " + snake.getHabitat());
        System.out.println("Species: " + snake.getSpecies());
        System.out.println("Color: " + snake.getColor());
        System.out.println("Weight: " + snake.getWeight() + "lbs");
        System.out.println();
        System.out.println("Fish");
        System.out.println("Habitat: " + fish.getHabitat());
        System.out.println("Species: " + fish.getSpecies());
        System.out.println("Color: " + fish.getColor());
        System.out.println("Weight: " + fish.getWeight() + "lbs");
        fish.justEaten();
        System.out.println("Fish has just been fed, new fish weight is " + fish.getWeight() + "lbs");

    }
}
