package If_else;

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		//Take two int values from user and print greatest among them.
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two Numbers : ");
        a=sc.nextInt();
        b= sc.nextInt();
        System.out.println(a>b?a+" is greatest":b+" is greatest");

	}

}
