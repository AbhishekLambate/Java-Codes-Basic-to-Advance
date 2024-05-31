package Input_by_user;

import java.util.Scanner;

public class Assignment04 {

	public static void main(String[] args) {
		 //Take name, roll number and field of interest from user and print in the format below :
        //
        //Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no : ");
        int no=sc.nextInt();
        System.out.println("Enter area of Interest : ");
        String field=sc.next();
        System.out.println("Enter name : ");
        String name=sc.next();

        System.out.println("Hey, my name is "+name+" and my roll number is "+no+" . My field of interest is " + field+".");

	}

}
