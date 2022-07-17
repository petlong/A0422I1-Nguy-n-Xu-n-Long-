package ss2_Array_Loop_Method.Exercise;

import java.util.Scanner;

public class TotalDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter row of square matrix: ");
        int row = scanner.nextInt();

        int[][] arrray = new int[row][row];
        arrray = createSquareMatrix(row);

        System.out.println("Square Matrix: ");
        printArray2D(arrray);

        System.out.println("Total Diagonal Of Square Matrix: "+getTotalDiagonal(arrray));

    }

    public static int[][] createSquareMatrix(int row) {
        int[][] arr = new int[row][row];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static void printArray2D(int[][] arr) {
        for (int[] ints : arr) {
            for (int temp : ints) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    public static int getTotalDiagonal(int [][] arr){
        int total=0;
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                if(i==j){
                    total+=arr[i][j];
                }
            }
        }return total;
    }
}
