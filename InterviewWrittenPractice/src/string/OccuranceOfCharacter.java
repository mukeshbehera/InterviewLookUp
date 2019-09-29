package string;

import java.util.HashMap;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String str = "ABBCCC";
		char[] chaArr = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : chaArr) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		System.out.println(hm);
	}
}

  /*
     Output:
     
     {A=1, B=2, C=3}
     
   */
