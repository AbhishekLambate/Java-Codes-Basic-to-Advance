package If_else;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// Take values of length and breadth of a rectangle from user and check if it is square or not.
        Scanner sc=new Scanner(System.in);
        int l,b;
        System.out.println("Enter length and breadth : ");
        l=sc.nextInt();
        b= sc.nextInt();
        System.out.println(l==b?"It is Square":"It is not square");
	}

}
