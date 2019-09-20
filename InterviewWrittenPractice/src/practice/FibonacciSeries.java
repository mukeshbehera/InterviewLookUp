package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c;
		for (int i = 1; i <= 10; i++) {
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}

/*
 *  Output :- 1 2 3 5 8 13 21 34 55 89
 */
