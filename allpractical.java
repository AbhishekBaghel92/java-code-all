# 15 Programs from the Java Collection Framework PDF (with Output)

Each program is saved as `Main.java` — compile and run each one separately.

## 1. Q2 Sum of All Elements (ArrayList)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 7, 2, 9, 3));
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
```

**Output:**
```
Sum = 25
```

## 2. Q4 Count Even and Odd (ArrayList)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 8, 11, 14, 17));
        int even = 0, odd = 0;
        for (int num : list) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
```

**Output:**
```
Even = 3
Odd = 3
```

## 3. Q6 Remove All Negative Numbers (ArrayList)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, -2, 7, -9, 0, 3));
        list.removeIf(num -> num < 0);
        System.out.println(list);
    }
}
```

**Output:**
```
[4, 7, 0, 3]
```

## 4. Q7 Reverse an ArrayList

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        System.out.println(list);
    }
}
```

**Output:**
```
[5, 4, 3, 2, 1]
```

## 5. Q10 Rotate the List to the Right (ArrayList)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        int n = list.size();
        if (n > 0) {
            k = k % n;
            Collections.reverse(list);
            Collections.reverse(list.subList(0, k));
            Collections.reverse(list.subList(k, n));
        }
        System.out.println(list);
    }
}
```

**Output:**
```
[4, 5, 1, 2, 3]
```

## 6. Q13 Frequency of Array Elements (HashMap)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 4};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);
    }
}
```

**Output:**
```
{1=2, 2=3, 3=1, 4=1}
```

## 7. Q14 Character Frequencies (HashMap)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String s = "programming";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq);
    }
}
```

**Output:**
```
{p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}
```

## 8. Q17 First Non-Repeating Character (HashMap)

> Fix applied: the PDF's `answer == '-' ? -1 : answer` mixes int and char, so it prints `119` (ASCII of 'w') instead of `w`. Changed only the print line.

```java
import java.util.*;
public class Main {
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
```

**Output:**
```
w
```

## 9. Q19 Check Anagrams (HashMap)

```java
import java.util.*;
public class Main {
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
```

**Output:**
```
Anagrams
```

## 10. Q25 Intersection of Two Arrays (HashSet)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) set.add(num);
        HashSet<Integer> result = new HashSet<>();
        for (int num : b) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);
    }
}
```

**Output:**
```
[2, 4]
```

## 11. Q27 Find the Missing Number (HashSet)

```java
import java.util.*;
public class Main {
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
```

**Output:**
```
3
```

## 12. Q30 Longest Consecutive Sequence (HashSet)

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        System.out.println(longest);
    }
}
```

**Output:**
```
4
```

## 13. Q34 Find the Middle Element (LinkedList)

```java
import java.util.*;
public class Main {
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
```

**Output:**
```
40
```

## 14. Q37 LinkedList as a Queue

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Removed = " + queue.poll());
        System.out.println("Front = " + queue.peek());
        System.out.println(queue);
    }
}
```

**Output:**
```
Removed = 10
Front = 20
[20, 30]
```

## 15. Q40 Rotate a LinkedList to the Right

```java
import java.util.*;
public class Main {
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
```

**Output:**
```
[4, 5, 1, 2, 3]
```
