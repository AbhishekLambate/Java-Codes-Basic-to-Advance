package Input_by_user;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// Write a program to take two integer inputs from user and print sum and product of them.
	    Scanner sc=new Scanner(System.in);
	        System.out.println("Enter no First : ");
	        int a = sc.nextInt();
	        System.out.println("Enter no Second : ");
	        int b = sc.nextInt();

	        System.out.println(a+b+" is sum and "+a*b +" is product.");
	}

}
