package ss02_array_loop_method.practice;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        //Nhập số lượng của mảng
        int size;
        int[] array;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        //Nhập giá trị cho mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        //in danh sách
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Duyệt các phần tử để tìm giá trị lớn nhất
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("\n"+"The largest property value in the list is " + max + " ,at position " + index);
    }
}
