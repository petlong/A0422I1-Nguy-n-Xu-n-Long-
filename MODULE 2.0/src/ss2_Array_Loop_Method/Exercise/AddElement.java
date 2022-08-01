package ss2_array_loop_method.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        //Nhập số lượng của mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size < 0)
                System.out.println("Enter again a size >0");
        } while (size < 0);

        //Nhập giá trị cho mảng
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Array: ");
        printArray(array);

        addElement(array);

        System.out.print("New Array: ");
        printArray(array);
    }

    public static void printArray(int[] arr){//in danh sách
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    public static int[] addElement(int [] arr) { // nhập phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number want to add: ");
        int inputNumber = scanner.nextInt();

        System.out.print("Element position wants to be added: ");
        int inputIndex = scanner.nextInt();

        if (inputIndex <= 1 || inputIndex >= arr.length - 1) {
            System.out.println("Can't add element. please enter index >1 && index <" + (arr.length - 1) + ")");
        } else {
            for (int i = inputIndex; i < arr.length-1; i++) {
                arr[i+1] = arr[i];
            }
            arr[inputIndex] = inputNumber;
        } return arr;
    }
}
