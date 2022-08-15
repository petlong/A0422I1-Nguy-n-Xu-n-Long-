package ss12_map_tree.practice.comparable_comparator;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Student{" + "name='" + name + '\'' + '}';
    }

    public int compareTo(Student student){
        return this.getName().compareTo(student.getName());
    }
}
