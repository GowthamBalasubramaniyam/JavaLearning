package example.collections.ListInterface;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Initial Vector: " + numbers);

        numbers.add(2, 25);
        System.out.println("After adding at index 2: " + numbers);

        System.out.println("Element at index 3: " + numbers.get(3));

        numbers.remove(1);
        System.out.println("After removing index 1: " + numbers);

        System.out.println("Using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Current size: " + numbers.size());
        System.out.println("Current capacity: " + numbers.capacity());
    }
}
