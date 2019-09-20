package number;

import java.util.Scanner;

public class ReverseNumberUserInput {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int leng = scr.nextInt();
		
		
		int[] a = new int[leng];
		//setting the vales in array
		System.out.print("Enter the numbers : ");
		for(int i=0; i<leng; i++)
		{
			a[i] = scr.nextInt();
		}
		
		
		
		//reversing and printing
		System.out.print("Reverse numbers are : ");
		for(int i = a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*
 *  Enter the length of the array : 5
 *  Input :- 12345
 *  Output :- 54321
 * 
 */
