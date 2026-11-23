import java.util.*;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        char answer = '-';
        for (char ch : s.toCharArray()) {
            if (freq.get(ch) == 1) {
                answer = ch;
                break;
            }
        }
        System.out.println(answer == '-' ? "-1" : String.valueOf(answer));
    }
}
