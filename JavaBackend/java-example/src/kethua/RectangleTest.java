package kethua;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(2.3, 5.8);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle2);
    }
}
