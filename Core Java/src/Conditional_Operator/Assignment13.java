package Conditional_Operator;

public class Assignment13 {

	public static void main(String[] args) {
		// Program to check if a number is a power of two.
		int a=36;
		double n=0;
		int i=0;
		int flag=0;
		while(n<=a) {
			n=Math.pow(2, i);
			if(n==a) {
				System.out.println(" number is a power of two");
				flag=1;
			}
			i++;
		}
		if(flag==0) {
			System.out.println(" number is not a power of two");
		}

	}

}
