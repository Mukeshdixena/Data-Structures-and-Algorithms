package T01_Arrays;

import java.util.HashSet;
import java.util.Set;

public class A04_contains_duplicate {

    static boolean containsDuplicate(int arr[]) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }

}