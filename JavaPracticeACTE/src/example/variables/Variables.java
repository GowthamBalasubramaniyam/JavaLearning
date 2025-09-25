package example.variables;

public class Variables {
	
	//instance variables
	String fan = "Fan turned ON";
	String light = "light turned ON";
	String fan2 = "Fan turned OFF";
	
	//static variables
	static String door = "Door opened";

	public static void main(String[] args) {
		
		//local variables
		int a = 10;
		
		System.out.println(a);

		Variables remote = new Variables();
			System.out.println(remote.fan);
			System.out.println(remote.light);
			System.out.println(remote.fan2);
			
			System.out.println(door);
	}

}
