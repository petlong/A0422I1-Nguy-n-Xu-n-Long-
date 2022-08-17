package ss13_searching.demo;

public class TestSearching {
    public static void main(String[] args) {
        int a[] = {1, 5, 9, 11, 16, 20, 22, 25, 27, 31, 39, 45};
        System.out.println("11: " + BinarySearch.binarySearch(a, 11));
        System.out.println("15: " + BinarySearch.binarySearch(a, 15));
        System.out.println("0: " + BinarySearch.binarySearch(a, 0));
        System.out.println("39: " + BinarySearch.binarySearch(a, 39));
        System.out.println("45: " + BinarySearch.binarySearch(a, 45));
        System.out.println("50: " + BinarySearch.binarySearch(a, 50));
    }
}
