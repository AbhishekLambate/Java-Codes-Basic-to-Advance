package Input_by_user;

import java.util.Scanner;

public class Assignment08 {

	public static void main(String[] args) {
		//Take 3 inputs from user and check :
        //
        //all are equal
        //
        //any of two are equal
        //
        //( use **&&||)**
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Three No's : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        System.out.println(a==b&&a==c&&b==c?"All are equal":(a==b||a==c||b==c?"Any of two are equal":"All are different"));

	}

}
