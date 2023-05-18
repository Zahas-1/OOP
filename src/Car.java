public class Car {
    private int wheels;
    private int windows;
    private String colour;
    private double weight;

    public Car(int wheels, int windows, String colour, double weight) {
        setWheels(wheels);
        setWindows(windows);
        setColour(colour);
        setWeight(weight);
    }

    public String toString() {
        return getClass().getName() + " Wheels: " + getWheels() + " Windows: " +  getWindows() + " Colour: " + getColour() + " Weight: " + getWeight();
    }

    public int getWheels() {
        return wheels;
    }



    public void setWheels(int wheels) {
        this.wheels = wheels;
    }



    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void wheelMissing(){
        wheels = wheels - 1;

    }

}