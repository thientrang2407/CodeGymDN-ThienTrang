package kethua;

public class Cylinder extends SmallCircle {
    private double height = 2;

    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }
    public Cylinder(){
    }
    public Cylinder (double height) {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolumeOfCylinder(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString(){
        return " A cylinder with radius = "
                + getRadius()
                + " , the height is: "
                + getHeight()
                + " and the volume of this is: "
                + getVolumeOfCylinder();


    }
}
