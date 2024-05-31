package Input_by_user;

import java.util.Scanner;

public class Assignment09 {

	public static void main(String[] args) {
		//Write a program to enter the values of two variables 'a' and 'b'
        // from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values for a and b : ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println(a<50&&a<b?"Both coditions are true":"Both coditions are not true");

	}

}
