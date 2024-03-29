// Java program to find the first 
// repeated character in a string 
import java.util.*; 

class Main 
{ 
	static char firstRepeating(char str[]) 
	{ 
		HashSet<Character> h = new HashSet<>(); 

		for (int i=0; i<=str.length-1; i++) 
		{ 
			char c = str[i]; 

			if (h.contains(c)) 
				return c; 

			else // Else add element to hash set 
				h.add(c); 
		} 
  
		return '\0'; 
	} 

	public static void main (String[] args) 
	{ 
		String str = "geeksforgeeks"; 
		char[] arr = str.toCharArray(); 
		System.out.println(firstRepeating(arr)); 
	} 
} 
