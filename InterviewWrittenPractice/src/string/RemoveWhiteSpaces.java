package string;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str = "Hel lo J ava Pr ogram mer";
		
		System.out.println(str.replaceAll(" ", ""));
	}
}

/*
 * Input :- Hel lo J ava Pr ogram mer
 * 
 * Output :- HelloJavaProgrammer
 *
 */