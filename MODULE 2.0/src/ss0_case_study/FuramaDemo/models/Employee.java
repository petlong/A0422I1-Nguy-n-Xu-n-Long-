package ss0_case_study.FuramaDemo.models;

public class Employee extends Person {
    private String position; //Chức vụ
    private int salary; //Lương

    public Employee() {
    }

    public Employee(int id, String name, int age, String address, String position, int salary) {
        super(id, name, age, address);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id: " + super.getId() +
                ", Tên: " + super.getName() + '\'' +
                ", Tuổi: " + super.getAge() +
                ", Địa chỉ: " + super.getAddress() + '\'' +
                ", Chức vụ : " + this.position + '\'' +
                ", Lương : " + this.salary + '\'' +
                '}';
    }
}
