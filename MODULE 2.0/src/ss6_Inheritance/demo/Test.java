package ss6_inheritance.demo;
public class Test {
    public static void main(String[] args) {
//        Car car = new SportCar("red", "Toyota", 50000, 300);
//
//        System.out.println("Price: " + car.getPrice());
//        car.move();
//        System.out.println(car.note);
//        System.out.println(((SportCar)car).maxSpeed);
        Car[] cars = new Car[2];
        cars[0] = new SportCar();
        cars[1] = new FamilyCar();

        for (Car car : cars) {
            car.move();
            if (car instanceof SportCar) {
                SportCar a = (SportCar) car;
            }

        }
    }

    public void process(Car car) {

    }

}
