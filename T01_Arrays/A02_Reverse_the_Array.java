package T01_Arrays;

public class A02_Reverse_the_Array {

    static void by_while_loop(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void by_recursion(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        by_recursion(arr, start + 1, end - 1);
    }
}
