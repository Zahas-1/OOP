import java.util.Scanner;
import java.util.Random;

public class lotteryGame {

    public static void main(String[] args) {
        //Assign variables
        Random rand = new Random();
        int upperBound = 9;
        int lotLength = 5;
        int matching = 0;

        //Create random number array
        int[] lotArray = new int[lotLength];
        for (int i = 0; i < lotArray.length; i++) {
            lotArray[i] = rand.nextInt(upperBound);
            System.out.print(" ");
            System.out.print(lotArray[i]);
        }
        //Take numbers from user to array
        System.out.println();
        System.out.println("Enter " + lotLength + " numbers: ");

        Scanner reader = new Scanner(System.in);
        int[] userArray = new int[lotLength];
        for (int i = 0; i < userArray.length; i++) {
        userArray[i] = Integer.parseInt(reader.nextLine());
        }

        //Compare user numbers against random numbers
        for (int i = 0; i < lotArray.length; i++) {


            for (int j = 0; j < userArray.length; j++) {
                if (lotArray[i] == userArray[j]){
                    matching = matching + 1;
                }
            }
        //Win conditions of lottery
        } if(matching == lotLength){
            System.out.println("YOU WON!!!");
        }  else if (matching > 0){
            System.out.println("You had " + matching + " matching numbers");
        } else System.out.println("You did not win :(");


    }
}
