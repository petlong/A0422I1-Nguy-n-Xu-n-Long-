package ss13_searching.demo;

public class BinarySearch {
    public static int binarySearch(int[] a, int x) {
        int left = 0, right = a.length - 1;
        int mid;

        while (right >= left) {
            mid = (left + right) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
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

    public static long giaiThuat(int x) {
        if (x <= 1) return 1;
        return x*giaiThuat(x-1);
    }
}