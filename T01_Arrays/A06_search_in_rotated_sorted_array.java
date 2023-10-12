package T01_Arrays;

public class A06_search_in_rotated_sorted_array {

    static int search_in_rotated_sorted_array(int arr[], int target) {

        int pivot = findPivot(arr);

        if (target == arr[pivot]) {
            return pivot;
        } else if (target > arr[arr.length - 1]) {
            return binarySearch(arr, 0, pivot - 1, target);
        } else {
            return binarySearch(arr, pivot + 1, arr.length - 1, target);
        }
    }

    static int binarySearch(int arr[], int s, int e, int target) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    static int findPivot(int arr[]) {

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[arr.length - 1] < arr[mid]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    static int findPivot2(int arr[]) {

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[arr.length - 1] < arr[mid]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    public static int findPivotBinarySearch(int[] array) {

        if (array == null || array.length == 0) {
            return -1;
        }

        // Case when array is not rotated. Then first index is the pivot
        if (array.length == 1 || array[0] < array[array.length - 1]) {
            return 0;
        }

        int start = 0, end = array.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            // check if mid+1 is pivot
            if (mid < array.length - 1 && array[mid] > array[mid + 1]) {
                return (mid + 1);
            } else if (array[start] <= array[mid]) {
                // If array[start] <= array[mid],
                // it means from start to mid, all elements are in sorted order,
                // so pivot will be in second half
                start = mid + 1;
            } else {
                // else pivot lies in first half, so we find the pivot in first half
                end = mid - 1;
            }
        }

        return 0;
    }
}
