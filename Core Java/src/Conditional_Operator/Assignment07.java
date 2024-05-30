package Conditional_Operator;

public class Assignment07 {

	public static void main(String[] args) {
		// Program to check if a year is a leap year.
		int year=2004;
		System.out.println((year%400==0 || (year%4==0 && year%100!=0))?"year is a leap year":"year is not leap year");

	}

}
