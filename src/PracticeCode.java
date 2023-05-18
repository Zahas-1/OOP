import java.util.Scanner;
import java.util.Arrays;

public class PracticeCode {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int find = 5;
        int index = -1; // Initialize the index to -1, in case the element is not found
        for (int i = 0; i < array.length; i++) {
            if(array[i] == find){
                index = i;
                break; // Exit the loop early since the element is found
            }
        }
        System.out.println(index);
    }
}
