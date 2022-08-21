package ss14_sort.exercise;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + size + " values:");
        for (int i=0; i<size; i++){
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");

        insertionSort(list);
    }

    public static void insertionSort(int[] list){
        for(int i=1; i< list.length; i++){
            for(int j=i; j>0;j--){
                if(list[j]<list[j-1]){
                    System.out.println("Swap " + list[j] + " with " + list[j - 1]);
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;

                }else {
                    break;
                }
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
