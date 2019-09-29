package array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String str = "hello mukesh";
		char[] charArr = str.toCharArray();
		
		//HashSet<Character> hs = new HashSet<Character>();
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for (int i = 0; i < charArr.length; i++) {
			hs.add(charArr[i]);
		}
		
		for(char ch : hs)
		{
			System.out.print(ch+" ");
		}
	}
}
