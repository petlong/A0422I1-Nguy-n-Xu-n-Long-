package ss3_oop.demo;

public class Test {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Huy");
//        student.setAge(18);
//        student.setAddress("Da Nang");
//
//        System.out.println("Name: " + student.getName());

        Teacher teacher = new Teacher();
        teacher.setName("Quang");
        System.out.println("Name: "+ teacher.getName());
        learning();
        Test test = new Test();
        test.study();
        Test.learning();
        test.learning();
        double a = 8;
        System.out.printf("%.0f", a);
    }

    public void study() {

    }

    public static void learning() {

    }

}
