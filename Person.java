public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String iName){
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = iName;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    public double bodyMassIndex(){
        double heightPerHundred = ((double)this.height) / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public void printPerson(){
        System.out.println(this.name + ", age " + this.age + " years");
    }
    public void growOlder(){
        this.age = this.age + 1;
    }
    public int rAge(){
        return this.age;
    }
    public boolean isOfLegalAge(){
        if(this.age < 18){
            return false;
        } return true;
    }


    public String getName(){
        return this.name;
    }

    //Changing the toString method to print something useful.
    public String toString(){
        return this.name + ", age " + this.age + " years, my body mass index is " + this.bodyMassIndex();
    }

    public static void main(String[] args){
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");
        Person martin = new Person("Martin");
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.out.println(matti.getName() + ", body mass index is: " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is: " + juhana.bodyMassIndex());

        ada.printPerson();
        antti.printPerson();
        martin.printPerson();

        ada.growOlder();
        antti.growOlder();

        ada.printPerson();
        antti.printPerson();
        System.out.println(ada.rAge());

        int i = 0;
        while (i < 30) {
            martin.growOlder();
            i = i + 1;
        }

        if (juhana.isOfLegalAge()) {
            System.out.print(juhana);
           //Same as juhana.printPerson(); as we've edited the toString method.
        } else {
            System.out.print(juhana);
        }



    }

}
