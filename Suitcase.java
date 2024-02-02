import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (" + totalWeight() + "kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + "kg)";
        }
        return this.items.size() + " items (" + totalWeight() + "kg)";
    }

    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        if (!(this.items.isEmpty())) {
            for (Item prints : this.items) {
                System.out.println(prints);
            }
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.getFirst();
        for (Item items : items) {
            if (items.getWeight() > heaviest.getWeight()) {
                heaviest = items;
            }
        }
        return heaviest;
    }

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        suitcase.printItems();
    }
}
