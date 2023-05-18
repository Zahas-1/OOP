public class CircleTest {
    public static void main(String[] args) {
        Circle circle01 = new Circle(1.0,"red");
        System.out.println("The radius of the circle is " + circle01.getRadius());
        System.out.println("The colour of the circle is " + circle01.getColor());
        System.out.println("The area of the circle is " + circle01.getArea() + "cm^2");
    }
}
