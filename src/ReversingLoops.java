import java.util.Scanner;
import java.util.Random;

public class ReversingLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        /*
        int upperbound = 9;

        int ArraySize = Integer.parseInt(reader.nextLine());
        int[] array = new int[ArraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(upperbound);
            System.out.print(array[i]);
        }
        System.out.println();

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        */
        //String word = reader.nextLine();
        //char[] letter = new char[word.length()];
        char[] letter = reader.nextLine().toCharArray();
        for (int i = 0; i < letter.length; i++) {
            //letter[i] = word.charAt(i);
            System.out.print(letter[i]);
        }
        System.out.println();
        for (int i = letter.length-1; i >= 0; i--) {
            System.out.print(letter[i]);
        }

    }
}
