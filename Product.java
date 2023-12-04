public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String iName, int iQuantity, double iPrice){
        this.name = iName;
        this.quantity = iQuantity;
        this.price = iPrice;
    }
    public void pProd(){
        System.out.println(this.name + ", Price: " + this.price + ", Quantity: " + this.quantity);
    }

    public static void main(String[] args){
        Product banana = new Product("Banana", 2, 3.2);
        banana.pProd();
    }
}
