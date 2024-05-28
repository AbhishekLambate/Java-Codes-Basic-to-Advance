package Operators;

public class Assignment10 {

	public static void main(String[] args) {
		 /*- Assignment - 10

	    Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.

	    1 - first program by using a third variable

	    2 - second program without using any third variable*/
	        int a=6;
	        int b=8;
	        System.out.println("Before swap numbers are : a="+a+" b="+b);
	        //by using 3rd variable
	        int c;
	        c=a;
	        a=b;
	        b=c;
	        System.out.println("After 1 st swap numbers are: a="+a+" b= "+b);
	        a=a+b;
	        b=a-b;
	        a=a-b;
	        System.out.println("After 2nd swap numbers are: a="+a+ " b="+b);

	}

}
