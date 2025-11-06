package example.collections.SetInterface;
import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();
		
		//inserting in reverse order
		for(int i=10;i>=0;i--) {
			numbers.add(i);
		}
		
		System.out.println(numbers);
		
		System.out.println("numbers.first() : "+numbers.first());
		
		TreeSet<String> names = new TreeSet<>();
		names.add("karthick");
		names.add("gowtham");
		names.add("kaaviyan");
		System.out.println(names);
	}

}
