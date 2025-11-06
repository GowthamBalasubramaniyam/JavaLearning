package example.collections.ListInterface;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Berlin");
		cities.add("Munich");
		cities.add("Hamburg");
		
		System.out.println("Intitial cities "+cities);
		
		cities.addFirst("Frankfurt");
		cities.addLast("Stadtgurt");
		
		System.out.println("After adding start and end cities "+cities);
		
		System.out.println("First city "+cities.getFirst());
		System.out.println("Last city "+cities.getLast());
		
		cities.removeFirst();
		cities.removeLast();
		
		System.out.println(".getFirst() : "+cities.getFirst());
		
		System.out.println("Final cities "+cities);
		
		System.out.println("number of cities "+cities.size());
		System.out.println("is empty? "+cities.isEmpty());
	}
}
