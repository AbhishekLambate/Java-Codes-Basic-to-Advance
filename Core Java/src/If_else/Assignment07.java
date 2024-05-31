package If_else;

import java.util.Scanner;

public class Assignment07 {

	public static void main(String[] args) {
		//Write a program to print absolute value of a number entered by user. E.g.-
        //
        //INPUT: 1 OUTPUT: 1
        //
        //INPUT: -1 OUTPUT: 1
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter value : ");
        a=sc.nextInt();
        if(a<0){
            a=a*(-1);
            System.out.println(a+" is absolute value.");
        }
        else{
            System.out.println(a+" is absolute value.");
        }
	}

}
