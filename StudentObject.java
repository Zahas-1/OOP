import java.util.Arrays;

public class StudentObject {
    public static void main (String[] args){
        //Name, course, age, hasCar?
        Student stu = new Student("Bob", "IT", 25, true);
        System.out.println("Name: " + stu.getName());
        System.out.println("Course: " + stu.getCourse());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Owns a car? " + stu.getHasCar());

        stu.setName("Jill");
        stu.setAge(22);
        System.out.println();
        System.out.println("New name: " + stu.getName());
        System.out.println("New age: " + stu.getAge());

        //Comparing arrays
        int[] arr = {1,2,3};
        int[][] deepAr = {{1,1},{2,2},{3,3},{4,4}};
        int[][] deepAr2 = {{1,1},{2,2},{3,3},{4,4}};
        String prn = Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(prn);
        String dPrn = Arrays.deepToString(deepAr);
        System.out.println(Arrays.deepToString(deepAr));
        System.out.println(dPrn);
        System.out.println(Arrays.deepEquals(deepAr2, deepAr));

        //Array.fill function test
        int[] arFill = new int[10];
        Arrays.fill(arFill, 5);
        System.out.println(Arrays.toString(arFill));

        //Array fill from index 10 to index 20 of arFill2 array
        int[] arFill2 = Arrays.copyOf(arFill, 20);
        Arrays.fill(arFill2,10,20,1);
        System.out.println(Arrays.toString(arFill2));

        //Sorting above array in ascending order and printing it
        Arrays.sort(arFill2);
        System.out.println("Above array sorted: " + Arrays.toString(arFill2));

        //Copying part of an array
        int[] arFillCopy = Arrays.copyOfRange(arFill, 0,5);
        int[] arFillCopy2 = Arrays.copyOfRange(arFill2, 10, 15);
        int[] arFillCopy3 = Arrays.copyOf(arFill, arFill.length + arFill2.length);
        System.arraycopy(arFill2, 0, arFillCopy3, arFill.length, arFill2.length);
        System.out.println(Arrays.toString(arFillCopy3));

        //Sorting above array in ascending order and printing it
        Arrays.sort(arFillCopy3);
        System.out.println("Above array sorted: " + Arrays.toString(arFillCopy3));






    }
}
