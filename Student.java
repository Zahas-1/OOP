public class Student {
    //Private fields
    private String name;
    private String course;
    private int age;
    private boolean hasCar;

    //Constructor class to initialise
public Student(String name, String course, int age, boolean hasCar){
        this.name = name;
        this.course = course;
        this.age = age;
        this.hasCar = hasCar;
    }

    //Getters for each private field
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public int getAge(){
        return age;
    }
    public boolean getHasCar(){
        return hasCar;
    }

    //Setters for each private field
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHasCar(boolean hasCar){
        this.hasCar = hasCar;
    }

}

