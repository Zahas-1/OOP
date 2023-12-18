public class Timer {
    //Create variables using OneMinute class
    private OneMinute milliS;
    private OneMinute seconds;

    //Create constructor using OneMinute class
    public Timer(){
        this.milliS = new OneMinute(100);
        this.seconds = new OneMinute(60);
    }
    //Create method to advance counter
    public void advance(){
        this.milliS.advance();
        if(this.milliS.value() == 0){
            this.seconds.advance();
        }
    }
    //Set a toString method
    public String toString(){
        return seconds + ":" + milliS;
    }
    //Create main method to test code
    public static void main(String[] args){
        Timer timer = new Timer();
        //Timer will run indefinitely and will need to be cancelled by user
        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
