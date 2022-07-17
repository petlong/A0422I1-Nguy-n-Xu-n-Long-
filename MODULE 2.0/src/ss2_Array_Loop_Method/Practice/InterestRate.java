package ss2_Array_Loop_Method.Exercise;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of moneys:");
        money = scanner.nextDouble();

        System.out.println("Enter amount of month:");
        month = scanner.nextInt();

        System.out.println("Enter amount of interestRate:");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
