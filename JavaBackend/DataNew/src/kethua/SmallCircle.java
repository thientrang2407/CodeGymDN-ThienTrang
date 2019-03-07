package kethua;

public class SmallCircle {
    public double radius;
    public String color;

    public SmallCircle(){
    }
    public SmallCircle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius (double radius){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    @Override
    public String toString(){
        return " A small circle with radius = "
                + getRadius()
                + " , the color is: "
                + getColor()
                + " and the area is "
                + getArea();
    }
}
