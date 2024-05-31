package Input_by_user;

import java.util.Scanner;

public class Assignment06 {

	public static void main(String[] args) {
		//Write a program to find square of a number.
        //
        //E.g.-
        //
        //INPUT : 2OUTPUT : 4
        //
        //INPUT : 5OUTPUT : 25
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no : ");
        int a= sc.nextInt();
        int square=a*a;
        System.out.println("The square of "+a+ " is "+square+".");

	}

}
