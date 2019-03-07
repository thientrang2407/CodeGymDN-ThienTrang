package kethua;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        MovablePoint movablePoint1 = new MovablePoint(10, 10, 3,5);
        System.out.println(movablePoint1.move().toString());
    }
}
