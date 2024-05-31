package If_else;

import java.util.Scanner;

public class Assignment08 {

	public static void main(String[] args) {
		//A student will not be allowed to sit in exam if his/her attendance is less than 75%.
        //
        //Take following input from user
        //
        //Number of classes held
        //
        //Number of classes attended.
        //
        //And print
        //
        //percentage of class attended
        //
        //Is student is allowed to sit in exam or not.
        Scanner sc=new Scanner(System.in);
        double a;
        int b;
        double p;
        System.out.println("Enter number of classes held. ");
        a=sc.nextInt();
        System.out.println("Enter number of classes attended.");
        b=sc.nextInt();
        p=(double) (b/a)*100;
        System.out.println("Student has attendance "+p+"%.");
        System.out.println( p>=75?"Student allowed to sit in exam.":"Student not allowed to sit in exam");
	}

}
