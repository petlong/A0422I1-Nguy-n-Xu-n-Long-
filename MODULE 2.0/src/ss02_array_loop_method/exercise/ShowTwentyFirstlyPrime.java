package ss02_array_loop_method.exercise;

import java.util.Scanner;

public class ShowTwentyFirstlyPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;
        boolean isInvalidNumber;
        do {
            System.out.println("Enter amount of prime: ");
            amount = scanner.nextInt();

            isInvalidNumber = amount <= 0;
            if (isInvalidNumber) {
                System.out.println("Please enter again amount > 0");
            }
        } while (isInvalidNumber);

        System.out.println("Twenty prime firstly: ");
        int number = 2;
        for (int i = 0; i < amount; ) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(number + "\t");
                i++;
            }
            number++;
        }
    }
}
