package string;

public class ReverseWord {
	
	public static void reverse(String str) 
	{
		String [] strArr = str.split(" ");
		for (int i = strArr.length-1; i>=0; i--) 
		{
			System.out.print(strArr[i]+" ");			
		}
	}
	
	//main method
	public static void main(String[] args) {
		ReverseWord.reverse("India is a great country");
	}

}
