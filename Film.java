import java.util.Scanner;
public class Film {
    private String name;
    private int ageRating;

    public Film(String name1, int ageRating1){
        this.name = name1;
        this.ageRating = ageRating1;
    }
    public String name1(){
        return this.name;
    }
    public int ageRating1(){
        return this.ageRating;
    }


    public static void main(String[] args){
        Film chipmunks = new Film("Chipmunks", 0);

        Scanner s = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(s.nextLine());
        System.out.println();

        if(age >= chipmunks.ageRating1()){
            System.out.println("You may watch the film " + chipmunks.name1());
        } else System.out.println("You may not watch the film");

    }


}
