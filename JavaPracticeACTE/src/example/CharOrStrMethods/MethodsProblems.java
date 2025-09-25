package example.CharOrStrMethods;

public class MethodsProblems {

	public static void main(String[] args) {
		
		System.out.println(countVowels("Education"));
		if(checkPalindrome("madam")) {
			System.out.println("the given string is a palindrome");
		}else {
			System.out.println("the given string is not a palindrome");
		}
		
		System.out.println(countDigits("Gowtham04/03/2004"));
	}
	//count vowels in a string
	static int countVowels(String str) {		
		int count = 0;
		String str2 = str.toLowerCase();
		for(int i =0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			if("aeiou".contains(ch+"")) {
				count++;
			}
		}
		return count;
	}
	
	//check palindrome
	static boolean checkPalindrome(String str) {
		String str1 = str.toLowerCase();
		StringBuilder str2 = new StringBuilder(str1).reverse();
		return str1.equals(str2.toString());
	}
	
	//count digits in a string
	static int countDigits(String str) {
		int count =0;
		for(int i =0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
