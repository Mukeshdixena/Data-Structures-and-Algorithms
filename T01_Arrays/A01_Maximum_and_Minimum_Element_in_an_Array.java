package T01_Arrays;

public class A01_Maximum_and_Minimum_Element_in_an_Array {

    static class pair {
        int min;
        int max;
    }

    static pair getMinMax(int arr[]) {
        pair ans = new pair();

        ans.min = arr[0];
        ans.max = arr[0];
        if (arr.length == 1) {
            return ans;
        }

        for (int i = 1; i < arr.length; i++) {
            if (ans.min > arr[i]) {
                ans.min = arr[i];
            }
            if (ans.max < arr[i]) {
                ans.max = arr[i];
            }
            ans.min = (ans.min > arr[i]) ? arr[i] : ans.min;
            ans.max = (ans.max < arr[i]) ? arr[i] : ans.max;
        }

        return ans;
    }
}
