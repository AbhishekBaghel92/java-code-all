import java.util.*;
public class RotateLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        int n = list.size();
        if (n > 0) {
            k %= n;
            for (int i = 0; i < k; i++) {
                int last = list.removeLast();
                list.addFirst(last);
            }
        }
        System.out.println(list);
    }
}
