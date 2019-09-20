package number;

public class SortNumber {

	static int[] a = {10,7,2,4,1,9,5,3,6,8};
	static int temp;
	
	//sorting logic
	public static void sort(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++) {
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		//printing sorted elements
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	//main method
	public static void main(String[] args) {
		
		SortNumber.sort(a);
	}	
}


/*
 *  Input :- 10,7,2,4,1,9,5,3,6,8
 *  Output :- 1 2 3 4 5 6 7 8 9 10 
 */
