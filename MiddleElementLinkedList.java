import java.util.*;
public class MiddleElementLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        int slow = 0;
        int fast = 0;
        while (fast < list.size() - 1) {
            slow++;
            fast += 2;
        }
        System.out.println(list.get(slow));
    }
}
