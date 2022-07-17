package ss2_Array_Loop_Method.Practice;

import java.util.Scanner;

public class DrwaingMenu {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            int length;
            int height = 0;
            int typeOfTriangle;
            String shape = "";
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");

                    System.out.print("Enter height: ");
                    height = scanner.nextInt();

                    System.out.print("Enter length: ");
                    length = scanner.nextInt();

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.print("Enter height: ");
                    height = scanner.nextInt();

                    System.out.println("Menu type of square triangle");
                    System.out.println("1. Square triangle has side in bottom left");
                    System.out.println("2. Square triangle has side in top left");
                    System.out.println("3. Square triangle has side in bottom right");
                    System.out.println("4. Square triangle has side in top right");

                    System.out.println("Enter type of square triangle: ");
                    typeOfTriangle = scanner.nextInt();
                    switch (typeOfTriangle) {
                        case 1:
                            System.out.println("Print square triangle has side in bottom left: ");
                            for (int i = 0; i < height; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 2:
                            System.out.println("Print square triangle has side in top left: ");
                            for (int i = 0; i < height; i++) {
                                for (int j = i; j < height; j++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 3:
                            System.out.println("Print square triangle has side in bottom right: ");
                            for (int i = 0; i < height; i++) {
                                for (int j = 0; j < height; j++) {
                                    if (j < height - 1 - i)
                                        System.out.print(" ");
                                    else
                                        System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 4:
                            System.out.println("Print square triangle has side in top right: ");
                            for (int i = 0; i < height; i++) {
                                for (int j = 0; j < height; j++) {
                                    if (j >= i)
                                        System.out.print("*");
                                    else
                                        System.out.print(" ");

                                }
                                System.out.print("\n");
                            }
                            break;
                        default:
                            System.out.println("No choice!");
                    }
                    break;

                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.print("Enter height: ");
                    height = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 1; j <= height * 2 - 1; j++) {
                            if (j >= height - i && j <= height + i)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);//Khi System.exit() được gọi, quá trình thực thi của JVM sẽ bị chấm dứt và dừng chương trình.
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
