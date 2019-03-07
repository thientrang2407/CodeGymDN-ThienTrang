package kethua;

public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float XiSpeed, float YiSpeed) {
        super(x, y);
        this.xSpeed = XiSpeed;
        this.ySpeed = YiSpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] getSpeed = {this.xSpeed, this.ySpeed};
        return getSpeed;
    }

    public void setSpeed(float XiSpeed, float YiSpeed) {
        this.xSpeed = XiSpeed;
        this.ySpeed = YiSpeed;
    }

    public MovablePoint move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }
    @Override
    public String toString (){
        return String.format("(%f,%f), speed=(%f, %f)", super.getX(), super.getY(), this.xSpeed, this.ySpeed);
    }
}

