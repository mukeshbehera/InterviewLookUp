package string;

import java.util.Scanner;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		
		String str ;
		String numbers;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter String that contains Numbers : ");
		str = scr.nextLine();
		scr.close();
		
		//extracting String
		numbers = str.replaceAll("[^0-9]", "");
		
		System.out.println("Numbers are : " + numbers);
	}
}

/*
 *  Input :- Mukesh@1990
 *  
 *  Output :- 1990
 */

