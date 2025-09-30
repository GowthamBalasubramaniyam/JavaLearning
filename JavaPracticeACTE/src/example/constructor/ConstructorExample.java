package example.constructor;

public class ConstructorExample {
	int a = 10;
	int b = 10;

	//constructor without paramenters
	ConstructorExample() {
		int c = a + b;
		System.out.println(c);
	}
	
	//constructor with paramenters
	ConstructorExample(int ad, int bc) {
		a = ad;
		b = bc;
		System.out.println(a * b);
	}
	
	ConstructorExample(int a , int b, String c){
		this.a = a;
		this.b = b;
		
	}
	
}
