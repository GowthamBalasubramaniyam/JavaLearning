package example.inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// basic inheritance
		Car obj = new Car();
		obj.start(); // from parent class
		obj.wheels(); // from child class

		System.out.println();

		// Single inheritance with constructor
		String name = "Gowtham";
		Student s = new Student(name, 95);
		s.display();
		s.show();
		
	}

}
