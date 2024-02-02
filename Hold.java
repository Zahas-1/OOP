import java.util.ArrayList;
public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;
    private int currentWeight;
    public Hold(int maxWeight){
        this.hold = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }
    public void addSuitcase(Suitcase suitcase){
        int suitcasesWeight = 0;
        for(Suitcase items : hold){
            suitcasesWeight += items.totalWeight();
        } if(suitcasesWeight <= maxWeight){
            hold.add(suitcase);
            suitcasesWeight += suitcase.totalWeight();
            currentWeight = suitcasesWeight;
        }
    }
    public void printItems(){
        for(Suitcase items : hold){
            items.printItems();
        }
    }

    public String toString(){
        return hold.size() + " suitcases (" + currentWeight + "kg)";
    }

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

}
