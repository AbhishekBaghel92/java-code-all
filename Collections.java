import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.remove("Bob");
        for (String n : names) System.out.println("Name: " + n);

        HashMap<String, String> dict = new HashMap<>();
        dict.put("Java", "A high-level, object-oriented programming language");
        dict.put("JVM", "Java Virtual Machine");
        String word = "Java";
        if (dict.containsKey(word)) System.out.println(word + ": " + dict.get(word));
        else System.out.println("Word not found in the dictionary");
    }
}
