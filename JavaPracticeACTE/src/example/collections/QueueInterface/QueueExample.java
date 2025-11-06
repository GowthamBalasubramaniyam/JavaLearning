package example.collections.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> names = new LinkedList<String>();
		names.offer("Gowtham");
		names.offer("Steve");
		names.offer("Tony");
		names.offer("Banner");
		names.offer("Nat");
		
		System.out.println("Name List : "+names);
		
		System.out.println("Head element "+names.peek());
	}

}
