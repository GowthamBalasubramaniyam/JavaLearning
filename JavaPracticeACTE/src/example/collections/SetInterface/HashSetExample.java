package example.collections.SetInterface;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate

        System.out.println("HashSet: " + set);

        // Remove an element
        set.remove("C++");
        System.out.println("After removal: " + set);

        // Check if element exists
        System.out.println("Contains 'Python'? " + set.contains("Python"));

        // Iterate using for-each
        for (String lang : set) {
            System.out.println("Language: " + lang);
        }
    }
}
