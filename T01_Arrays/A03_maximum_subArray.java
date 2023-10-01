package T01_Arrays;

public class A03_maximum_subArray {
    static int maxSubArray(int arr[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            ms = Math.max(cs, ms);
            cs = (cs < 0) ? 0 : cs;
        }
        return ms;
    }
}
