import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
