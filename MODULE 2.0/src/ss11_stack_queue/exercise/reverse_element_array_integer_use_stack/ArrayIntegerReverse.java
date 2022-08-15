package ss11_stack_queue.exercise.reverse_element_array_integer_use_stack;

import java.util.Stack;

public class ArrayIntegerReverse {
    public static void main(String[] args) {
        int[] arrayInteger = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array Integer before reverse: ");
        for (int k : arrayInteger) {
            System.out.print(" " + k);
        }

        System.out.println("\nArray Integer after reverse: ");
        reverse(arrayInteger);
        for (int i : arrayInteger) {
            System.out.print(" " + i);
        }
    }

    public static int[] reverse(int[] arr) {
        Stack<Integer> integerStack = new Stack<>();
        for (int j : arr) {
            integerStack.push(j);
        }
        while (!integerStack.isEmpty()) {
            for (int i=0; i< arr.length;i++) {
                arr[i] = integerStack.pop();
            }
        }
        return arr;
    }
}