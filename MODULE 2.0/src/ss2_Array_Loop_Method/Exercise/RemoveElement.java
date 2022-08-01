package ss2_array_loop_method.exercise;
import java.util.Scanner;

public class RemoveElement {
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

        removeElement(array);

        System.out.print("New Array: ");
        printArray(array);
    }

        public static void printArray(int[] arr){//in danh sách
            for (int i : arr) {
                System.out.print(i + "\t");
            }
        }

        public static int[] removeElement(int [] array){ // xóa phần tử của mảng
        System.out.print("\nEnter a number want to remove: ");
        Scanner scanner= new Scanner(System.in);
        int inputNumber=scanner.nextInt();
        int indexRemove;
        for (int i=0; i<array.length; i++){
            if(array[i]==inputNumber){
                indexRemove=i;
                System.out.println("Index of input a number in array is: "+indexRemove);
                for(int j=indexRemove; j<array.length-1; j++){
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
            }else {
                System.out.println();
            }
        } return array;
    }
}
