package Operators;

public class Assignment13 {

	public static void main(String[] args) {
		 /*- Assignment - 13

	    Write a program to calculate the sum of the first and the second last digit of a 5 digit number.

	    E.g.- NUMBER : 12345        OUTPUT : 1+4=5*/
	        int number=12345;
	        int digit1=number/10000;
	        System.out.println(digit1);

	        number=number/10;
	        int digit2=number%10;
	        System.out.println(digit2);
	        System.out.println("Sum of first and second last digit is :"+(digit1+digit2));
	   
	}

}
