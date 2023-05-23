public class House {
    private int doors;
    private String doorColor;
    private int windows;
    private String windowColor;
    private boolean hasGarden;
    private boolean hasDriveway;

    public House(int doors, String doorColor, int windows, String windowColor, boolean hasGarden, boolean hasDriveway){
        setDoors(doors);
        setDoorColor(doorColor);
        setWindows(windows);
        setWindowColor(windowColor);
        setHasGarden(hasGarden);
        setHasDriveway(hasDriveway);
    }
//Getters

    public int getDoors(){
        return doors;
    }
    public String getDoorColor(){
        return doorColor;
    }
    public int getWindows(){
        return windows;
    }
    public String getWindowColor(){
        return windowColor;
    }
    public boolean getHasGarden(){
        return hasGarden;
    }
    public boolean getHasDriveway(){
        return hasDriveway;
    }

//Setters
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setDoorColor(String doorColor){
        this.doorColor = doorColor;
    }
    public void setWindows(int windows){
        this.windows = windows;
    }
    public void setWindowColor(String windowColor){
        this.windowColor = windowColor;
    }
    public void setHasGarden(boolean hasGarden){
        this.hasGarden = hasGarden;
    }
    public void setHasDriveway(boolean hasDriveway){
        this.hasDriveway = hasDriveway;
    }


}
