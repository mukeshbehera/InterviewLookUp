package array;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		
		String str = "mkeshbehera";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(Character c : ch)
		{
			if (hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		Set<Character> key = hm.keySet();
		System.out.println("Duplicate elements in : "+str);
		
		for (Character chr : key)
		{
			if (hm.get(chr)>1)
			{
				System.out.println(chr +"="+ hm.get(chr));
			}
		}
	}
}
