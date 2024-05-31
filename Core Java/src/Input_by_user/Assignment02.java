package Input_by_user;

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		 /* 1. Take two integer inputs from user.
        2. First calculate the sum of two then product of two.
        3. Finally, print the sum and product of both obtained results.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no First : ");
        int a = sc.nextInt();
        System.out.println("Enter no Second : ");
        int b = sc.nextInt();
        int sum=a+b;
        int product=a*b;
        System.out.println(sum+" is sum and "+product +" is product");
	}

}
