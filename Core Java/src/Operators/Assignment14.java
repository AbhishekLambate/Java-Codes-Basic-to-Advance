package Operators;

public class Assignment14 {

	public static void main(String[] args) {
		/*- Assignment - 14

	    Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.

	    For example, if the number which was taken is 5696, then the displayed number should be 7818.*/
	        int number=1234;

	        int digit4=(number%10)+2;
	        number=number/10;
	        int digit3=(number%10)+2;
	        number=number/10;
	        int digit2=(number%10)+2;
	        int digit1=(number/10)+2;
	        int newNumber=digit1;
	        newNumber=(newNumber*10)+digit2;
	        newNumber=(newNumber*10)+digit3;
	        newNumber=(newNumber*10)+digit4;
	        System.out.println("Newnumber is : "+newNumber);

	}

}
