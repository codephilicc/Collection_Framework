package practice;

public class Stringreverseusingstringbuilder {

	public static void main(String[] args) {

		String s1 ="Welcome to disneyland";
		StringBuilder s2 = new StringBuilder();
		
		s2.append(s1);
		s2 = s2.reverse();
		
		System.out.println(s2);
	}

}
