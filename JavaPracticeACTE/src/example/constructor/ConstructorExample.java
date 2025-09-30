package example.constructor;

public class ConstructorExample {
	int a = 10;
	int b = 10;

	

	ConstructorExample(int ad, int bc) {
		a = ad;
		b = bc;
		System.out.println(a * b);
	}
	
	ConstructorExample() {
		int c = a + b;
		System.out.println(c);
	}
}
