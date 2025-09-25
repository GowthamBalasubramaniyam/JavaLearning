package example.scannerclass;
import java.util.Scanner;

public class ScannerClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		System.out.println("Enter your name :");
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		System.out.println("haha your name is "+name+"!!!");
	}

}
