package If_else;

import java.util.Scanner;

public class Assignment05 {

	public static void main(String[] args) {
		 //A school has following rules for grading system:
        //
        //a. Below 25 - F
        //
        //b. 25 to 45 - E
        //
        //c. 45 to 50 - D
        //
        //d. 50 to 60 - C
        //
        //e. 60 to 80 - B
        //
        //f. Above 80 - A
        //
        //Ask user to enter marks and print the corresponding grade
        Scanner sc=new Scanner(System.in);
        int mark;
        System.out.println("Enter marks : ");
        mark= sc.nextInt();
        if(mark<25){
            System.out.println("fail");
        }
        else if(mark>=25&&mark<45){
            System.out.println("E grade");
        }
        else if(mark>=45&&mark<50){
            System.out.println("D grade");
        }
        else if(mark>=50&&mark<60){
            System.out.println("C grade");
        }
        else if(mark>=60&&mark<80){
            System.out.println("B grade");
        }
        else if(mark>=80&&mark<=100){
            System.out.println("A grade");
        } else {
            System.out.println("Enter Valid marks");
        }
	}

}
