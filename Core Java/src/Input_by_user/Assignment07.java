package Input_by_user;

import java.util.Scanner;

public class Assignment07 {

	public static void main(String[] args) {
		 //Take two different string input and print them in same line. E.g.-
        //
        //INPUT : Codes
        //
        //Dope
        //
        //OUTPUT : CodesDope
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String a=sc.next();
        System.out.println("Enter second string : ");
        String b= sc.next();
        System.out.println(a+b);
	}

}
