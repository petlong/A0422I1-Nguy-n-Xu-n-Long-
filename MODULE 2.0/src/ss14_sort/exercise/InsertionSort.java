package ss14_sort.exercise;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void insertionSort(int[] list){
        for(int i=1; i< list.length; i++){
            for(int j=i; j>0;j--){
                if(list[j]<list[j-1]){
                        int temp = list[j];
                        list[j] = list[j-1];
                        list[j-1] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
