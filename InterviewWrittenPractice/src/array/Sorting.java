package array;

import java.util.ArrayList;

public class Sorting {
	
	int temp;

	public void sort(ArrayList<Integer> al)
	{
		for (int i=0; i<al.size(); i++) {

			for (int j=1; j<al.size(); j++) {
				
				if(al.get(i) > al.get(j))
				{
					temp = al.get(i);
					al.set(i, j);
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		
		int[] num= {3,6,2,4,1};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			al.add(num[i]);
			
		}
		System.out.println(al);
		
		Sorting s = new Sorting();
		s.sort(al);
		
	}

}
