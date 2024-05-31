package Input_by_user;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		//If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
        // write a program to calculate his total marks and percentage marks.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of three Subjects : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int total=a+b+c;
        float percentage=total/3;
        System.out.println("Totl marks are "+total+ " and percentage is "+percentage+".");

	}

}
