import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    private String fName;
    private String lName;
    private int ID;
    public PersonalInformationCollection(String first, String last, int idNO){
        this.fName = first;
        this.lName = last;
        this.ID = idNO;
    }
    public String toString(){
        return this.fName + " " + this.lName;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Create an array for object personal info collection
        ArrayList<PersonalInformationCollection> arr1 = new ArrayList<>();

        //Repeat until a blank line is entered
        while(true){
            System.out.println("Enter first name: ");
            String fName = s.nextLine();
            if(fName.trim().isEmpty()){
                break;
            }
            System.out.println("Enter second name: ");
            String sName = s.nextLine();
            System.out.println("Enter ID number: ");
            int ID = Integer.parseInt(s.nextLine());

            //Add user details to the array
            arr1.add(new PersonalInformationCollection(fName, sName, ID));
        }
        //Print array info
        for(PersonalInformationCollection fName : arr1){
            System.out.println(fName);
        }

    }
}
