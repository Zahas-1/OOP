public class Guage {
    private int value;

    public Guage(){
        this.value = 0;
    }
    public void increase(){
        if(this.value < 5){
            this.value += 1;
        }
    }
    public void decrease(){
        if(this.value > 0){
            this.value -= 1;
        }
    }
    public int value(){
        return this.value;
    }
    public boolean full(){
        if(this.value == 5){
            return true;
        } return false;
    }

    public static void main(String[] args){
        Guage g = new Guage();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }


}
