package ss2_ArrayAndLoop.Exercise;

import java.util.Scanner;

public class JoinArray {
    public static void main(String[] args) {
        int sizeArray1;
        int sizeArray2;
        int sizeArray3;
        int[] array1;
        int[] array2;
        int[] array3;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size of Array 1: ");
            sizeArray1 = scanner.nextInt();

            System.out.print("Enter a size of Array 2: ");
            sizeArray2 = scanner.nextInt();

            if (sizeArray1 < 0 || sizeArray2 < 0)
                System.out.println("Enter again a size >0");
        } while (sizeArray1 < 0 || sizeArray2 < 0);

        //Nhập giá trị cho mảng
        array1 = new int[sizeArray1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 1: ");
            array1[i] = scanner.nextInt();
        }

        array2 = new int[sizeArray2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 2: ");
            array2[i] = scanner.nextInt();
        }

        sizeArray3 = sizeArray1 + sizeArray2;
        array3 = new int[sizeArray3];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            array3[j + sizeArray1] = array2[j];
        }

        System.out.print("Array 3: ");
        printArray(array3);
    }

    public static void printArray(int[] arr) {//in danh sách
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
//    public static void getArray(int[]arr,int size) {
//        Scanner scanner=new Scanner(System.in);
//        int[] arr;
//        do {
//            System.out.print("Enter a size of array:");
//            size = scanner.nextInt();
//            if (size < 0)
//                System.out.println("Enter again a size >0");
//        } while (size < 0);
//
//        arr = new int[size];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter element " + (i + 1) + " : ");
//            arr[i] = scanner.nextInt();
//        }
//    }

}
