package T01_Arrays;

public class A09_repeat_and_mising_number {

    static int[] findNumbers(int arr[]) {
        int arrSum = 0;
        int arrSqurSum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            arrSqurSum += arr[i] * arr[i];
        }
        int totalSum = (n * (n + 1)) / 2;
        int totalSqurSum = (n * (n + 1) * (2 * n + 1)) / 6;

        // a - b = totalsum - arrsum

        int temp1 = totalSum - arrSum;
        int temp2 = (totalSqurSum - arrSqurSum) / temp1;

        int a = (temp1 + temp2) / 2;
        int b = (temp1 - temp2) / 2;
        int ans[] = new int[2];
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}
