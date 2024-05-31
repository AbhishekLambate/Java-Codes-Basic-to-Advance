package If_else;

import java.util.Scanner;

public class Assignment09 {

	public static void main(String[] args) {
		 //Modify the above question to allow student to sit if he/she has medical cause.
        // Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
        Scanner sc=new Scanner(System.in);
        double a;
        int b;
        boolean m;
        double p;
        System.out.println("Enter number of classes held. ");
        a=sc.nextInt();
        System.out.println("Enter number of classes attended.");
        b=sc.nextInt();
        System.out.println("Enter true if you have medical cause otherwise false.");
        m=sc.nextBoolean();
        System.out.println(m);
        p=(double) (b/a)*100;
        System.out.println("Student has attendance "+p+"%.");
        System.out.println( m || p>=75 ?"Student allowed to sit in exam.":"Student not allowed to sit in exam");
  
	}

}
