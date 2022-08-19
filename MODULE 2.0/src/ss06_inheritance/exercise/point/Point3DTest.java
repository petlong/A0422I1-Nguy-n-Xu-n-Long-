package ss06_inheritance.exercise.point;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1.0f,2.0f,3.0f);
        System.out.println(point3D);
    }
}
