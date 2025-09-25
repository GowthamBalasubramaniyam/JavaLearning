package example.conditionalstatements;

public class ConditionalStatementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if condition
		int a = 10;
		int b = 20;
		if(a==b) {
			System.out.println("both are equal");
		}
		
		//if-else
		if(a==b) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		//else-if ladder
		if(a==b) {
			System.out.println("both are equal");
		}else if(a>b) {
			System.out.println("a greater than b");
		}else if(b>a) {
			System.out.println("b greater than a");
		}else {
			System.out.println("nothing");
		}
		
		//nested if
		
		boolean gate = true;
		boolean door = true;
		boolean terrace = true;
		
		if(gate) {
			if(door) {
				if(terrace) {
					System.out.println("gate => door => terrace => you have complete access");
				}else {
					System.out.println("gate => door => you don't have access to the terrace");
				}
			}else {
				System.out.println("gate => you don't have access to the door");
			}
		}else {
			System.out.println("you don't have access to the gate");
		}
		
		//ternary 
		
		String access = (gate&&door&&terrace)?"you have complete access":"you don't have access";
		
		System.out.println(access);
	}

}
