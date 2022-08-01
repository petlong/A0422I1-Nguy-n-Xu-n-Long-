package ss1_introduction.exercise;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amounts of money type USD: ");
        int moneyUSD = scanner.nextInt();
        int moneyVND = moneyUSD * 23000;

        System.out.println("Amounts of money covert from USD to VND: " + moneyVND);
    }
}
