import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int upperBound = 2;
        int randomNumber = rand.nextInt(upperBound);
        int lives = 5;

        while(lives > 0){
            System.out.println("Guess the number between 1 and 10: ");
            Scanner reader = new Scanner(System.in);
            int playerGuess = Integer.parseInt(reader.nextLine());

            lives--;
            System.out.println("You have " + lives + " lives left!");
            System.out.println(randomNumber);

            if (playerGuess == randomNumber && lives > 0){
                System.out.println("You win!");
                break;

            } else if (playerGuess != randomNumber && lives > 0){
                System.out.println("You guessed wrong!");
                System.out.println("Try again");
            } else if (lives <= 0){
                System.out.println("Game Over");
            }

        }





            }
        }



