package ss6_inheritance.demo;
public class SportCar extends Car {
    public String note = "sport car";
    public String test;
    public SportCar(){}
    public SportCar(String color, String model, double price, double maxSpeed) {
        super(color, model, price);
        this.maxSpeed = maxSpeed;
    }
    public double maxSpeed;


    public void move() {
        super.move();
        System.out.println("Sport car move");
    }
}
