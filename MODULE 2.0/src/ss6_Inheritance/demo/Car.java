package ss6_inheritance.demo;

public class Car {
    public String color;
    public String model;
    public String note = "car";
    private double price;

    public Car() {

    }

    public Car(String color, String model, double price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public void move() {
        System.out.println("Car move");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
