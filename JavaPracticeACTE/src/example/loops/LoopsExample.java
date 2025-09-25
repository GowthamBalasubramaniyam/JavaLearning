package example.loops;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch statement
		String key = "sun";

		switch (key) {
		case "mon":
			System.out.println("its monday");
			break;
		case "tue":
			System.out.println("its tuesday");
			break;
		case "wed":
			System.out.println("its wednesday");
			break;
		case "thurs":
			System.out.println("its thursday");
			break;
		case "fri":
			System.out.println("its friday");
			break;
		case "sat":
			System.out.println("its saturday");
			break;
		case "sun":
			System.out.println("its sunday");
		}

		// for loop
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		//while loop
		int num = 10;
		while(num<=50) {
			System.out.print(" "+num);
			num++;
		}
		
		//do-while
		do {
			System.out.println(num);
			num++;
		}while(num<=60);
		
		//for each loop
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		for(int q : arr) {
			System.out.println(q);
		}
		
	}

}
