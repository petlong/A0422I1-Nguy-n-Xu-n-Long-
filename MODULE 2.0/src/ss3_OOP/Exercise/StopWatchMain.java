package ss3_OOP.Exercise;

public class StopWatchMain {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[1000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }

        StopWatch stopWatch = new StopWatch();


        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("\nTimes start sort: " + stopWatch.getStartTime());

        selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        stopWatch.stop();//in thời gian kết thúc sort
        System.out.println("\nTimes stop sort: " + stopWatch.getEndTime());
        System.out.println("Times sort: " + stopWatch.getElapsedTime());
    }
}
