package string;

public class ReverseString1 {

	public static void reverse(String str)
	{
		
		String [] strArr = str.split(" ");
		for (int i = strArr.length-1; i>=0; i--) 
		{
			System.out.print(strArr[i]+" ");			
		}
	}
	
	public static void main(String[] args) {
		
		ReverseString1.reverse("Hello Mukesh");
	}
}
