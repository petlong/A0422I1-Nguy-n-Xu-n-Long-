package ss00_case_study.furama_resort.utils;

import java.util.Scanner;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);

    public static String regexString(String temp, String regex, String error){
        boolean check = true;
        do{
            if(temp.matches(regex)){
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        }while (check);
        return temp;
    }
}
