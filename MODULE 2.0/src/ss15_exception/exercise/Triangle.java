package ss15_exception.exercise;

import java.util.Scanner;

public class Triangle {
    public static boolean checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if(a<=0 || b<=0 || c<=0 || a+b<=c || (a+c)<=b || (b+c)<=a){
            throw new IllegalTriangleException("Các cạnh tam giác không hợp lệ");
        }return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao canh thu nhat: ");
        double a = scanner.nextInt();
        System.out.print("Nhap vao canh thu hai: ");
        double b = scanner.nextInt();
        System.out.print("Nhap vao canh thu ba: ");
        double c = scanner.nextInt();

        while (true){
            try {
                if(checkTriangle(a,b,c));
            break;
        } catch (IllegalTriangleException e) {
            System.out.println("Exception: " + e.getMessage());
                System.out.println("Nhập lại ba cạnh của tam giác");
                System.out.print("Nhap vao canh thu nhat: ");
                 a = scanner.nextInt();
                System.out.print("Nhap vao canh thu hai: ");
                 b = scanner.nextInt();
                System.out.print("Nhap vao canh thu ba: ");
                 c = scanner.nextInt();
        }
    }
        System.out.println("Tam giác hợp lệ");
}
}
