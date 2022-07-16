package ss2_ArrayAndLoop.Exercise;

import java.util.Scanner;

public class FindMaxElementOfArrayMatrix {
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
        int max = matrix[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Max element in array: element [" + indexRow + "][" + indexCol + "]");
    }
}
