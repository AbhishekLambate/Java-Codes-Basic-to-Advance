package Operators;

public class Assignment12 {

	public static void main(String[] args) {
		/*- Assignment - 12

	    The total number of students in a class are 90 out of which 45 are boys.

	    If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.*/
	        int totalStudents=90;
	        int boys=45;
	        int boysWithAgrade=20;
	        int girls=totalStudents-boys;
	        int studentsWithAgrade=45;
	        int girlsWithAgrade=studentsWithAgrade-boysWithAgrade;
	        System.out.println("Total girls are "+girls+ " out of that girls with 'A' grade are :"+girlsWithAgrade);
	   
	}

}
