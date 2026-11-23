import java.util.*;
public class SumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 7, 2, 9, 3));
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
