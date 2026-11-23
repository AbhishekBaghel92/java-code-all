import java.util.*;
public class RemoveNegativeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, -2, 7, -9, 0, 3));
        list.removeIf(num -> num < 0);
        System.out.println(list);
    }
}
