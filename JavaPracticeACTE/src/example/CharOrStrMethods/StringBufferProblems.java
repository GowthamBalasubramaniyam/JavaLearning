package example.CharOrStrMethods;

public class StringBufferProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Gowtham");
		sb.append(" 2004");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		System.out.println(checkPalindrome("Madam"));
		System.out.println(insertWord(" Java"));
		
		System.out.println(deleteSubstring("aaaabbbbcccc", 4, 8));
		
		System.out.println("String problems completed");
	}
	//check palindrome
	static boolean checkPalindrome(String str) {
		String str1 = str.toLowerCase();
		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();
		return str1.equals(str2.toString());
	}
	//insert a word
	static String insertWord(String str) {
		StringBuffer str1 = new StringBuffer("Hello");
		str1.insert(str1.length(), str);
		String str2 = str1.toString();
		return str2;
	}
	
	//delete a substring
	static String deleteSubstring(String str, int startIndex, int endIndex) {
		StringBuffer str1 = new StringBuffer(str);
		return str1.delete(startIndex, endIndex).toString();
	}
	

}
