package ss16_text_file.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DemoFile {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nam", 18, "Da Nang"));
        students.add(new Student("Thanh", 19, "Da Nang"));
        students.add(new Student("Bao", 20, "Quang Nam"));

//        FileUtils.writeFile("student.csv", students, false);
        File file = new File("sample.txt");
        System.out.println(file.getAbsoluteFile());
//        FileUtils.writeFileWithResource("E:\\CodeGym\\A0422I1\\student.csv", students, false);
        // \n \t \\ \" \r CRLF

        List<Student> studentListFromFile = FileUtils.getStudentFromFile("student.csv");
        studentListFromFile.forEach(System.out::println);
    }
}
