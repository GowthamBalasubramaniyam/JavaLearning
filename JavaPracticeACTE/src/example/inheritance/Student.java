package example.inheritance;

public class Student extends Person {
	private int marks;

	Student(String name, int marks) {
		super(name);
		this.marks = marks;
	}

	void show() {
		System.out.println("Marks got : " + marks);
	}
}
