import java.util.Scanner;
import java.util.ArrayList;
public class Books {
    private String name;
    private int noPages;
    private int pubYear;

    public Books(String name, int noPages, int pubYear){
        this.name = name;
        this.noPages = noPages;
        this.pubYear = pubYear;
    }
    public String toString(){
        return this.name + ", " + this.noPages + " pages, " + this.pubYear;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();

        while(true){
            System.out.println("Enter the name of the book: ");
            String name = s.nextLine();
            if(name.trim().isEmpty()){
                break;
            }
            System.out.println("Enter the number of pages of this book: ");
            int noPages = Integer.valueOf(s.nextLine());
            System.out.println("Enter the release year of this book: ");
            int pubYear = Integer.valueOf(s.nextLine());

            book.add(new Books(name, noPages, pubYear));
        }
        System.out.println("What would you like to print? (everything/name)");
        String printChoice = s.nextLine().toLowerCase();
        if (printChoice.equals("name")) {
            for (Books book2 : book) {
                System.out.println(book2.getName());
            }
        } else if (printChoice.equals("everything")) {
            for (Books book2 : book) {
                System.out.println(book2);
            }
        }
    }
}
