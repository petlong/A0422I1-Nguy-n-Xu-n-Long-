package ss13_searching.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */

        System.out.println(binarySearchDeQuy(list,11,0, list.length));

    }


    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

    public static int binarySearchDeQuy(int[] a, int x, int left, int right) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (a[mid] == x) return mid;
        if (a[mid] > x) {
            return binarySearchDeQuy(a, x, left, mid -1);
        } else {
            return binarySearchDeQuy(a, x, mid + 1, right);
        }
    }
}
