package If_else;

import java.util.Scanner;

public class Assignment06 {

	public static void main(String[] args) {
		//Take input of age of 3 people by user and determine oldest and youngest among them.
        int a;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of 3 people : ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        System.out.println(a>b&&a>c?a +" is oldest":(b>a&&b>c?b+" is oldest":c+" is oldest"));
        System.out.println(a<b&&a<c?a +" is youngest":(b<a&&b<c?b+" is youngest":c+" is youngest"));

	}

}
