import java.util.*;
public class RotateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        int n = list.size();
        if (n > 0) {
            k = k % n;
            reverse(list, 0, n - 1);
            reverse(list, 0, k - 1);
            reverse(list, k, n - 1);
        }
        System.out.println(list);
    }

    private static void reverse(ArrayList<Integer> list, int left, int right) {
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}