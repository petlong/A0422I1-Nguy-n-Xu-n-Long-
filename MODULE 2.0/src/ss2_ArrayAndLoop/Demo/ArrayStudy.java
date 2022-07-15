package ss2_ArrayAndLoop.Demo;

public class ArrayStudy {
    public static void main(String[] args) {
        //===============Cách 1===================
        //Khai báo trước
        double[] arr;//khai báo mảng 1 chiều các số nguyên.

        //Khởi tạo sau
        arr = new double[5];// tất cả 5 phần tử đều có giá trị là 0
        arr[0] = 10.5;
        arr[2] = 10;

        //Vừa khởi tạo vừa khai báo.
        String[] str = new String[2]; // tất cả 5 phần tử đều có giá trị là null

        //===============Cách 2===================
        int[] arr2 = new int[]{10, 20, 30, 40, 50};
        int[] arr3 = {10, 20, 30, 40, 50}; //cách khai báo tắt
        //=> áp dụng khi khai báo trên cùng 1 dòng
        //int [] arr4;
        //arr4 ={10,20,30,40,50}; //=> lỗi

        System.out.println(arr3.length);
        System.out.println(arr3[4]);

        //===============Mảng 2 chiều===================
        int[][] arr5 = {{1,2},{3,4,5},{6,7}};
    }
}
