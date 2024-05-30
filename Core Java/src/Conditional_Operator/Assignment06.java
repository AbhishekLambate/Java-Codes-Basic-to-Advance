package Conditional_Operator;

public class Assignment06 {

	public static void main(String[] args) {
		// Program to find the maximum of three numbers.
		int a=14;
		int b=12;
		int c=15;
		System.out.println((a>b && a>c)?"maximum number is "+a:
			(b>a && b>c)?"maximum number is "+b:
				"maximum number is "+c);

	}

}
