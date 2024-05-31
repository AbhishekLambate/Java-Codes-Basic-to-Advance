package If_else;

import java.util.Scanner;

public class Assignment04 {

	public static void main(String[] args) {

        //A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
        //
        //Ask user for their salary and year of service and print the net bonus amount.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary and year of services : ");
        float a;
        float b;
        float c;
        a= sc.nextFloat();
        b= sc.nextFloat();
        if (b>=5){
            System.out.println("Employee get bonus");
            c=a/2;
            System.out.println("The net bonus amount is "+c);
        }
        else {
            System.out.println("Employee has experience less than 5 years so, no bonus given to employee.");
        }
	}

}
