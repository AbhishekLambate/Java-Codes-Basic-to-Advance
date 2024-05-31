package Input_by_user;
import java.util.Scanner;
public class Assignment03 {

	public static void main(String[] args) {
		 //Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no First : ");
        double l= sc.nextDouble();
        System.out.println("Enter no Second : ");
        double b = sc.nextDouble();
        double area=l*b;
        System.out.println((int)area);
	}

}
