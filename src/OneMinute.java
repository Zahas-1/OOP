public class OneMinute {
    //Declare instance variables
    private int limit;
    private int value;
    //Create constructor
    public OneMinute(int limit){
        this.value = 0;
        this.limit = limit;
    }
    //Create method to advance with no arguments
    public void advance(){
        this.value += 1;
        if(this.value >= limit){
            this.value = 0;
        }
    }
    //Set a toString method
    public String toString(){
        if(this.value < 10){
            return "0" + this.value;
        } return "" + this.value;
    }
    //Create getter to return value
    public int value(){
        return this.value;
    }



}

