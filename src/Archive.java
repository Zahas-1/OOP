import java.util.Scanner;
import java.util.ArrayList;
public class Archive {
    //Declare instance variables
    private String name;
    private String identifier;
    //Initialise constructor
    public Archive(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    //toString method to print something useful
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    //If the objects are located in the same position, they're equal
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        //If the compared object is not of the same type, they're not equal
        if (!(compare instanceof Archive)) {
            return false;
        }
        //Convert the object to an Archive object
        Archive compareArchive = (Archive) compare;
        //If the ID is the same, the objects are the same
        return this.identifier.equals(compareArchive.identifier);
    }
    public static void main(String[] args) {
        //Initialise scanner
        Scanner s = new Scanner(System.in);
        //Create an arraylist of type Archive
        ArrayList<Archive> archive = new ArrayList<>();

        //Run while loop until the user enters a blank space
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = s.nextLine().trim();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = s.nextLine().trim();
            if (name.isEmpty()) {
                break;
            }
            //Adds the user inputted information to the array list
            if (archive.contains(new Archive(name, id))) {
                System.out.println("ID already exists");
            } else archive.add(new Archive(name, id));
        }
        //Iterates through the arraylist and prints everything in the list
        for (Archive items : archive) {
            System.out.println(items);
        }
    }
}
