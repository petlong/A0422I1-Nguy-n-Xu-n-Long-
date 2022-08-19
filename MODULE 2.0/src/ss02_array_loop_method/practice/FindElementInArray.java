package ss02_array_loop_method.practice;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] student={"A", "B","C"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String inputName=scanner.nextLine();

        boolean isExist= false;
        for (int i=0; i<student.length;i++){
            if(student[i].equals(inputName)){ //equals() phương thức so sánh chuỗi
                System.out.println("Position of the students in the list " + inputName + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + inputName + " in the list.");
        }
    }
}
