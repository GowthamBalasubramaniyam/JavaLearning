package example.collections.SetInterface;
import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> languages = new LinkedHashSet<String>();
		languages.add("Tamil");
		languages.add("Malayalam");
		languages.add("Telugu");
		languages.add("Kannada");
		languages.add("German");
		
		System.out.println(languages.contains("German"));
	}

}
