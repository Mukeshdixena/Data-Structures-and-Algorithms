package T01_Arrays;

import java.util.Arrays;

public class A05_chocolet_distribution_problem {

    static int chocoletDistribution(int arr[], int m) {
        int diff = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - m - 1; i++) {
            diff = Math.min(diff, arr[i + m - 1] - arr[i]);
        }
        return diff;
    }

}