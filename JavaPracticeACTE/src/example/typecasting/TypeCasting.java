package example.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit type casting
		int a = 10;
		double b = a; //implicit type casting
		System.out.println("Implicit type casting: " + b);
		
		//explicit type casting
		double c = 10.5;
		
		int d = (int) c; //explicit type casting
		System.out.println("Explicit type casting: " + d);
	}

}
