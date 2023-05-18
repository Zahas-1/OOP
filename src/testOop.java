public class testOop {
    //Create class main

        //Create a class attribute
        int x;
        //Create a class constructor for the Main class
        public testOop() {
            x = 5;
            //set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            //create an object of class Main (This will call the constructor)
            testOop myObj = new testOop();
            System.out.println(myObj.x);
        }
    }

