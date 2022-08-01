package ss6_inheritance.demo;

public class Math {
    public int plus(int a, int b) {
        return a + b;
    }

    public int plus(int a, int b, int c) {
        return a + b + c;
    }

    public float plus(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.plus(5 , 6);
        math.plus(6, 7, 8);
    }
}
