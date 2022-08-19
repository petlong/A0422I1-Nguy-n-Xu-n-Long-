package ss02_array_loop_method.exercise;

import java.util.Scanner;

public class TotalNumberOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int colCalculate;
        int total;

        System.out.print("Enter row of array 2D: ");
        int row = scanner.nextInt();
        System.out.print("Enter column of array 2D: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];
        array = createArray2D(row, col);
        System.out.println("Array 2D: ");
        printArray2D(array);
        System.out.print("The column that you want to calculate: ");
        colCalculate = scanner.nextInt();
        total = getTotalOfColumn(array, colCalculate);
        System.out.print("Total of column " + colCalculate + ": " + total);
    }

    public static int getTotalOfColumn(int[][] arr, int col) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (col < arr[i].length)
                total += arr[i][col];
        }
        return total;
    }

    public static void printArray2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int temp : arr[i]) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createArray2D(int row, int col) {
        int[][] arr = new int[row][col];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
}
