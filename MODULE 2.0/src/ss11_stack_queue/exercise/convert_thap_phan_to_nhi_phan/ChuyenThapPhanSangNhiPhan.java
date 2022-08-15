package ss11_stack_queue.exercise.convert_thap_phan_to_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack integerStack = new Stack<>();

        System.out.println("Nhập vào một số thập phân");
        int number = scanner.nextInt();
        while (number!=0){
            int numberOut = number%2;
            integerStack.push(numberOut);
            number/=2;
        }

        System.out.println("Giá trị của nhị phân là: ");
        while (!integerStack.isEmpty()){
            System.out.print(integerStack.pop());
        }
    }
}
