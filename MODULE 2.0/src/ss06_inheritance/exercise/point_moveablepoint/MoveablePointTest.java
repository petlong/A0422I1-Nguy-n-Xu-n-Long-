package ss06_inheritance.exercise.point_moveablepoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint move = new MoveablePoint();
        System.out.println(move);

        move = new MoveablePoint(2.0f, 1.0f);
        System.out.println(move);

        move = new MoveablePoint(3.0f, 4.0f, 2.0f, 1.0f);
        System.out.println(move);

        System.out.println(move.move());
        System.out.println(move.move());


    }
}
