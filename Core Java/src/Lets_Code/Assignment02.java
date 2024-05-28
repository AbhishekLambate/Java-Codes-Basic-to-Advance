package Lets_Code;

public class Assignment02 {
	public static void main(String[] args) {
//		Assignment - 02
//		Write a program to print following on screen
//		*
//		**
//		***
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
