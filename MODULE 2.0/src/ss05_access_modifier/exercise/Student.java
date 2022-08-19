package ss05_access_modifier.exercise;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    Student(){}

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

     void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
}
