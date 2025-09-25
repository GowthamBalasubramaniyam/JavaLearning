package example.CharOrStrMethods;

public class CharMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		char n = '6';
		System.out.println("isLetter : "+Character.isLetter(ch));
		System.out.println("isLowercase : "+Character.isLowerCase(ch));
		System.out.println("toUpperCase : "+Character.toUpperCase(ch));
		System.out.println("isDigit : "+Character.isDigit(n));
		System.out.println("isDigit : "+Character.isDigit(ch));
		System.out.println("isLetterOrDigit : "+Character.isLetterOrDigit(ch));
	}

}
