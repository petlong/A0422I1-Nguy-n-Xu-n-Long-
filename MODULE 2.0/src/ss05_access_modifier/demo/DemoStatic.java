package ss05_access_modifier.demo;

public class DemoStatic {
    public static int count;
    public String name;
    int y;

    static {
        count = 1;
        System.out.println("Count: "+ count);
    }

    public DemoStatic() {
        int count = 0;
        DemoStatic.count++;
        System.out.println("Constructor");
    }

    public static void display() {
        System.out.println(count);
    }
}
