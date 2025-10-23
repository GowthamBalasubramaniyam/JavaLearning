package example.collections.ListInterface;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> students = new ArrayList<>();
		
		students.add("Gowtham");
		students.add("Samreetha");
		students.add("Abishek");
		students.add("Siranjeevi");
		students.add("Unknown");

		System.out.println("Initial List " + students);

		students.remove("Unknown");

		System.out.println("After removal " + students);
		System.out.println("List size " + students.size());
		
		students.addFirst("Unknown2");
		students.addLast("Unknown3");
		System.out.println("Add first method " + students);
		
		students.sort(Comparator.naturalOrder());
		System.out.println("Sorting in natural order " + students);

	}

}
