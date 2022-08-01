package ss2_array_loop_method.exercise;

import java.util.Scanner;

public class FindMinElementOfArray2D {
    public static void main(String[] args) {
        int column;
        int row;
        int[][] matrix;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size rows:");
            row = scanner.nextInt();
            System.out.print("Enter a size columns:");
            column = scanner.nextInt();
            if (column < 0 || row < 0)
                System.out.println("Enter again a size columns or rows >0");
        } while (column < 0 || row < 0);

        matrix = new int[row][column];
        System.out.println("Enter " + row + " rows and " +
                column + " columns: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int min = matrix[0][0];
//        int indexRow=0;
//        int indexCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
//                    indexRow=i;
//                    indexCol=j;
                }
            }
        }
        System.out.println("Value of min element in array: " + min);
    }
}
