package example.constructor;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample obj = new ConstructorExample();
		System.out.println(obj.c);

		ConstructorExample obj1 = new ConstructorExample(20, 20);
		System.out.println(obj1.result);
		
		ConstructorExample obj2 = new ConstructorExample(obj);
		System.out.println(obj2.a+" "+obj2.b);
	}

}
