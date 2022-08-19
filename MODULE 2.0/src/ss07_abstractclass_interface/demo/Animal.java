package ss07_abstractclass_interface.demo;

public abstract class Animal {
    private String name;
    private String color;

    public abstract void speak();

    public String getInfo() {
        return "Name: " + name + "| Color: " + color;
    }
}
