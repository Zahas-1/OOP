import java.util.Scanner;
import java.util.ArrayList;

public class TVProg {
    private String name;
    private int duration;
    //Constructor for above variables
    public TVProg(String pName, int pDur){
        this.name = pName;
        this.duration = pDur;
    }
    //To string method so output will print variables and not memory locations
    public String toString(){
        return this.name + ", " + this.duration + " minutes";
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Arraylist for object TVProg
        ArrayList<TVProg> ar1 = new ArrayList<>();

        while(true){
            //Repeat until user enters a blank line
            System.out.println("Enter the name of a program: ");
            String pName = s.nextLine();
            if(pName.trim().isEmpty()){
                break;
            }
            System.out.println("Enter duration of this program: ");
            //Takes user input for duration of program
            int dur = Integer.valueOf(s.nextLine());
            //Create a new object of TVProg and add this to the arraylist defined earlier
            ar1.add(new TVProg(pName, dur));
        }
        System.out.println("What's the max duration? ");
        int maxDur = Integer.valueOf(s.nextLine());

        for(TVProg entries : ar1){
            if(entries.duration <= maxDur){
                System.out.println(entries);
            }
        }
    }
}
