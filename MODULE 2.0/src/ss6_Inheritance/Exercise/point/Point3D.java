package ss6_inheritance.exercise.point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }
    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float [] getXYZ() {
        float[] arrayXYZ = new float[3];
        arrayXYZ[0] = getX();
        arrayXYZ[1] = getY();
        arrayXYZ[2] = getZ();
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return "Point 3D: " + "(" + super.getX() + "," + super.getY() + "," + getZ() + ")";
    }
}