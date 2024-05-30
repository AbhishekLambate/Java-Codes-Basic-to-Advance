package Operators;

public class Assignment16 {

	public static void main(String[] args) {
		/*- Assignment - 16

	    Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231*/
	        int number=132;
	        int reversedNumber=0;
	        int digit=number%10;
	        reversedNumber=(reversedNumber*10)+digit;
	        number=number/10;
	        digit=number%10;
	        reversedNumber=(reversedNumber*10)+digit;
	        number=number/10;
	        reversedNumber=(reversedNumber*10)+number;
	        System.out.println("Reversed number is : "+reversedNumber);
	  
	}

}
