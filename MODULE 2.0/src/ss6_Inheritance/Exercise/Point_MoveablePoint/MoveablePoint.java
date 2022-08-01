package ss6_inheritance.exercise.point_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] arraySpeed = new float[2];
        arraySpeed[0] = getXSpeed();
        arraySpeed[1] = getYSpeed();
        return arraySpeed;
    }

    public MoveablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = (" + getSpeed()[0] + "," + getSpeed()[1] + ")";
    }

}
