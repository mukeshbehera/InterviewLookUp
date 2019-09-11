package array;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAscendingDescending {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(40);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, (I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		System.out.println(al);
	}

}
