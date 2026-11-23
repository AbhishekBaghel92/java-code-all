import java.util.*;
public class CheckAnagrams {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : a.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : b.toCharArray()) {
            if (!freq.containsKey(ch) || freq.get(ch) == 0) {
                System.out.println("Not Anagrams");
                return;
            }
            freq.put(ch, freq.get(ch) - 1);
        }
        System.out.println("Anagrams");
    }
}
