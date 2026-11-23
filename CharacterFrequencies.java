import java.util.*;
public class CharacterFrequencies {
    public static void main(String[] args) {
        String s = "programming";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq);
    }
}
