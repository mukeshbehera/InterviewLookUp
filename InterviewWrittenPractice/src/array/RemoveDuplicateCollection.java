package array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCollection {

	public static void main(String[] args) {
		
		int []a = {10,3,8,5,4,2,5,22,3,8,7};
		
		//HashSet<Integer> hs = new HashSet<Integer>(); //HashSet -- Order not preserved
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		
		for(int no : hs)
		{
			System.out.print(no + " ");
		}
	}
}
