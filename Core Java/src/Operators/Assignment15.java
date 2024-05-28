package Operators;

public class Assignment15 {

	public static void main(String[] args) {
		  /*- Assignment - 15

	    Write a program to calculate the sum of the digits of a 3-digit number.

	    Number : 132        Output : 6*/
	        int number=132;
	        int digit3=number%10;
	        number=number/10;
	        int digit2=number%10;
	        int digit1=number/10;
	        System.out.println("Sum of the digits is : "+(digit1+digit2+digit3));
	  
	}

}
