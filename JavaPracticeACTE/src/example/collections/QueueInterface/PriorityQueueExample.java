package example.collections.QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i =100;i>90;i--) {
			pq.add(i);
		}
		System.out.println("Initial queue : "+pq);
		System.out.println("Head element : "+pq.peek());
		System.out.println("Removed element : "+pq.poll());
		System.out.println("Final queue : "+pq);
		
		PriorityQueue<Integer> reverseQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i =100;i>90;i--) {
			reverseQueue.add(i);
		}
		System.out.println("Custom comparator : "+reverseQueue);
	}

}
