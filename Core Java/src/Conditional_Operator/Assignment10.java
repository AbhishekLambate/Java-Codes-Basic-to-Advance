package Conditional_Operator;

public class Assignment10 {

	public static void main(String[] args) {
		// Program to check if a character is an alphabet or not.
		 char ch='a';
	        System.out.println((((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'))) ? "character is an alphabet" :
	                "character is not an alphabet");

	}

}
