import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SuitcaseTest {

    @Test
    void testToString_emptySuitcase() {
        Suitcase suitcase = new Suitcase(10);
        assertEquals("no items (0kg)", suitcase.toString());
    }

    @Test
    void testToString_singleItem() {
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(new Item("Book", 2));
        assertEquals("1 item (2kg)", suitcase.toString());
    }

    @Test
    void testToString_multipleItems() {
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(new Item("Book", 2));
        suitcase.addItem(new Item("Phone", 1));
        assertEquals("2 items (3kg)", suitcase.toString());
    }


    @Test
    void printItems_emptySuitcase() {
        Suitcase suitcase = new Suitcase(10);
        suitcase.printItems(); // Just test if it runs without exceptions
    }

    @Test
    void printItems_nonEmptySuitcase() {
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(new Item("Book", 2));
        suitcase.addItem(new Item("Phone", 1));
        suitcase.printItems(); // Just test if it runs without exceptions
    }

    @Test
    void totalWeight_emptySuitcase() {
        Suitcase suitcase = new Suitcase(10);
        assertEquals(0, suitcase.totalWeight());
    }

    @Test
    void totalWeight_nonEmptySuitcase() {
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(new Item("Book", 2));
        suitcase.addItem(new Item("Phone", 1));
        assertEquals(3, suitcase.totalWeight());
    }

    @Test
    void heaviestItem_emptySuitcase() {
        Suitcase suitcase = new Suitcase(10);
        assertNull(suitcase.heaviestItem());
    }

    @Test
    void heaviestItem_singleItem() {
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(new Item("Book", 2));
        assertEquals("Book", suitcase.heaviestItem().getName());
    }

    @Test
    void heaviestItem_multipleItems() {
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(new Item("Book", 2));
        suitcase.addItem(new Item("Phone", 1));
        suitcase.addItem(new Item("Laptop", 4));
        assertEquals("Laptop", suitcase.heaviestItem().getName());
    }
}
