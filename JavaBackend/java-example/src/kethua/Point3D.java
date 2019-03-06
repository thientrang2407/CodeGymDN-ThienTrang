package kethua;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public Point3D(float z) {
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }
    public float[] getXYZ(){
        float [] xyz = {this.x, this.y, this.z};
        return xyz;
    }
    public void setXYZ(){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString (){
        return "Point3D has x = "
                +getX()
                + " y = "
                +getY()
                +" z = "
                +getZ();
    }
}

