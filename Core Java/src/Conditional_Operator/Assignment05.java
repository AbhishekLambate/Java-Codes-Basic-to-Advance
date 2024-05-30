package Conditional_Operator;

public class Assignment05 {

	public static void main(String[] args) {
		// Program to find the minimum of three numbers.
		int a=14;
		int b=12;
		int c=15;
		System.out.println((a<b && a<c)?"minimum number is "+a:
			(b<a && b<c)?"minimum number is "+b:
				"minimum number is "+c);
	}

}
