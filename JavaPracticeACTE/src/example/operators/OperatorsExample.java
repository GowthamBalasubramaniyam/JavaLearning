package example.operators;

public class OperatorsExample {
	public static void main(String[] args) {
		// arithmetic operators
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		int d = a - b;
		System.out.println(d);
		int e = a * b;
		System.out.println(e);
		int f = a / b;
		System.out.println(f);
		int g = a % b;
		System.out.println(g);

		// Logical operators
		System.out.println(a > b && b < a);
		System.out.println(b > a || a > b);

		// Relational operators
		if (a == b) {
			System.out.println("a equals to b");
		}
		if (a != b) {
			System.out.println("a not equal to b");
		}
		if (a > b) {
			System.out.println("a greater than b");
		}
		if (a < b) {
			System.out.println("a smaller than b");
		}
		if (a <= b) {
			System.out.println("a less than or equal to b");
		}
		if (a >= b) {
			System.out.println("a greater than or equal to");
		}

		// Assignment operators
		a += b;
		System.out.println("addition "+a);
		a -= b;
		System.out.println("subtraction "+a);
		a *=b;
		System.out.println("multiplication "+a);
		a /=b;
		System.out.println("division "+a);
		a %=b;
		System.out.println("modulus "+a);
		
		//increment ,decrement
		int num = 100;
		num++;
		System.out.println(num);
		num--;
		num--;
		System.out.println(num);
		
		//ternary operator
		int number = (num>b)?num:b;
		System.out.println(number);
	}
}
