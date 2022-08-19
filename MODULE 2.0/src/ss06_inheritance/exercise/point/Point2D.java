package ss06_inheritance.exercise.point;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){}

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arrayXY = new float [2];
            arrayXY[0] = getX();
            arrayXY[1] = getY();
            return arrayXY;
    }

    @Override
    public String toString(){
//        return "Point 2D: " + "(" + getX() + "," + getY() + ")";
        return "Point 2D: " + "(" + getXY()[0] + "," + getXY()[1] + ")";
    }
}
