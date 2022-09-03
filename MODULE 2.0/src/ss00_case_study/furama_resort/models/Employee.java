package ss00_case_study.furama_resort.models;

public class Employee extends Person{
    public String educationLevel;
    public String position;
    public double salary;

    public Employee(){}

    public Employee(String educationLevel, String position, double salary) {
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String address, String educationLevel, String position, double salary) {
        super(id, name, dateOfBirth, gender, idCard, phoneNumber, email, address);
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }



    public String getEducationLevel() {
        return educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", educationLevel='" + educationLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
