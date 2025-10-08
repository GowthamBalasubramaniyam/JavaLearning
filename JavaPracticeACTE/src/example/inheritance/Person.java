package example.inheritance;

public class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("The name is " + name);
	}
}
