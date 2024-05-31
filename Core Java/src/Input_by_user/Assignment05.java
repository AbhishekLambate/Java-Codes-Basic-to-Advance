package Input_by_user;

import java.util.Scanner;

public class Assignment05 {

	public static void main(String[] args) {
		//Take side of a square from user and print area and perimeter of it.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of side : ");
        int a= sc.nextInt();
        int area=a*a;
        int perimeter=4*a;
        System.out.println(area+" is area and  "+perimeter+" is perimeter of square.");
 
	}

}
