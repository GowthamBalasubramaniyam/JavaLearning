package example.constructor;

public class ConstructorExample {
	int a = 10;
	int b = 10;
	int c;
	int result;

	// constructor without parameters
	ConstructorExample() {
		c = a + b;
	}

	// constructor overloading (two or more constructors )
	// constructor with parameters
	ConstructorExample(int ad, int bc) {
		a = ad;
		b = bc;
		result = a * b;
	}

	// copy constructors
	ConstructorExample(ConstructorExample c) {
		a = c.a;
		b = c.b;

	}

}
