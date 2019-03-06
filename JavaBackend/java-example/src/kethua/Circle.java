package kethua;

public class Circle extends Shape {
    private double radius = 1;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
        this.radius = radius;
    }

    public Circle(double radius) {
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " A circle with radius "
                + getRadius()
                + " Which is a subclass of "
                + super.toString();
    }
}
