package ss5_Access_Modifier.Exercise;

public class SetStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Henry");
        student.setClasses("CO3");

        System.out.println("Name: " + student.getName());
        System.out.println("Class: " + student.getClasses());
    }
}
