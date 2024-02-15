package practice;

import java.util.Arrays;

public class sortingString {

	
	static String sortString(String s1) {
		
		char[] c = s1.toCharArray();
		
		Arrays.sort(c);
		
		return new String(c);
		
	}
	
	
	public static void main(String[] args) {

		String s = "geeksforgeeks";
		
		System.out.println("soring string: "+ sortString(s));
		
	}

}
