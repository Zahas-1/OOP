public class ComparingApartments {
    //Declare private variables
    private int rooms;
    private int squares;
    private int pricePerSquare;
    //Constructor to initialise variables
    public ComparingApartments(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    //Method to return true if object 1 is larger than object 2
    public boolean largerThan(ComparingApartments compared){
        if(this.squares > compared.squares){
            return true;
        } else return false;
    }
    //Method to return the absolute price difference between object 1 and object 2
    public int priceDifference(ComparingApartments compared){
        return Math.abs((this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares));
    }
    //Method to calculate if object 1 is more expensive than object 2
    public boolean moreExpensiveThan(ComparingApartments compared){
        if((this.pricePerSquare * this.squares) > (compared.pricePerSquare * compared.squares)){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        //Testing method functions
        ComparingApartments manhattanStudioApt = new ComparingApartments(1, 16, 5500);
        ComparingApartments atlantaTwoBedroomApt = new ComparingApartments(2, 38, 4200);
        ComparingApartments bangorThreeBedroomApt = new ComparingApartments(3, 78, 2500);
        //Testing method to return true if object 1 is larger
        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true
        //Testing method to return the price difference of each object
        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400
        //Testing method to return true if first object is more expensive
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true

    }

}
