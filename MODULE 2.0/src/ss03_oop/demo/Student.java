package ss03_oop.demo;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Student(String name, int age, String address) {
//        this();
//        this(name, age);
        this(name, address);
        this.address = address;

    }

    public void study(String subject){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
