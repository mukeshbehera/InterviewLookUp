package practice;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str="malayalam";
		StringBuilder sb=new StringBuilder(str);
		
		
		if(sb.reverse().toString().equals(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}	
	}
}

/*
 *  Input :- malayalam
 *  Output :- Palindrome
 */
