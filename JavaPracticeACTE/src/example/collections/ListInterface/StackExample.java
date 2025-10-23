package example.collections.ListInterface;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> skills = new Stack<>();
		skills.push("HTML");
		skills.push("CSS");
		skills.push("React");
		skills.push("Java");
		
		System.out.println("Initial skill set "+skills);
		
		System.out.println("checking the top element "+skills.peek());
		System.out.println("removing the top element "+skills.pop());
		System.out.println("After removal "+skills);
		
		System.out.println("position of css "+skills.search("CSS"));
	}
}
