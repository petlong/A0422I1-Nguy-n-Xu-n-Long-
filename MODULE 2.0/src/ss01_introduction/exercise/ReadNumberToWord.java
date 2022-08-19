package ss01_introduction.exercise;

import java.util.Scanner;

public class ReadNumberToWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isInvalidNumber;
        do {
            System.out.println("Enter a number to be read: ");
            number = scanner.nextInt();

            isInvalidNumber = number < 0;
            if (isInvalidNumber) {
                System.out.println("Please enter again a number >= 0");
            }
        } while (isInvalidNumber);

        int hundreds = number / 100;
        int tens = (number - hundreds * 100) / 10;
        int units = number - hundreds * 100 - tens * 10;

        if (number >= 0 && number < 10) {
            readNumberTenDown(number);
        } else if (number >= 10 && number < 100) {
            readNumberHundredDown(tens, units);
        } else if (number >= 100 && number < 1000) {
            readNumberHundredUp(hundreds, tens, units);
        }
    }

    private static void readNumberTenDown(int number) {
        switch (number) {
            case 0:
                System.out.print("zero");
                break;
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
        }
    }

    private static void readNumberHundredDown(int tens, int units) {
        switch (tens) {
            case 1:
                switch (units) {
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    default:
                        readNumberTenDown(units);
                        System.out.print("teen");
                }
                break;
            case 2:
                System.out.print("twenty ");
                switch (units) {
                    case 0:
                        System.out.print("");
                        break;
                    default:
                        readNumberTenDown(units);
                }
                break;
            case 3:
                System.out.print("thirty ");
                switch (units) {
                    case 0:
                        System.out.println("");
                        break;
                    default:
                        readNumberTenDown(units);
                }
                break;
            case 5:
                System.out.print("fifty ");
                switch (units) {
                    case 0:
                        System.out.println("");
                        break;
                    default:
                        readNumberTenDown(units);
                }
                break;
            default:
                readNumberTenDown(tens);
                System.out.print("ty ");
                switch (units) {
                    case 0:
                        System.out.print("");
                        break;
                    default:
                        readNumberTenDown(units);
                }
        }
    }

    private static void readNumberHundredUp(int hundreds, int tens, int units) {
        readNumberTenDown(hundreds);
        System.out.print(" hundred ");
        if (tens == 0 && units == 0) {
            System.out.print("");
        } else {
            System.out.print("and ");
            readNumberHundredDown(tens, units);
        }
    }
}