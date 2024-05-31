package If_else;

import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args) {
		 //A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        //
        //Ask user for quantity
        //
        //Suppose, one unit will cost 100.
        //
        //Judge and print total cost for user.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter quantity : ");
        int a;
        int b;
        int c;
        a= sc.nextInt();
        if(a>=10){
            System.out.println("User get discount");
            b=(a*100)/10;
            c=(a*100)-b;
            System.out.println("User have to pay "+c+" amount after discount.");
        }
        else{
            System.out.println("User will not get discount");
            b=a*100;
            System.out.println("User have to pay "+b+" amount .");
        }
	}

}
