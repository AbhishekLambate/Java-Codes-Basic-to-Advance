package Operators;

public class Assignment04 {

	public static void main(String[] args) {
		/*Now, solve the above question[Assignment - 03] using assignment operators (eg. +=, -=, *=).*/
        int number = 2345;
        number += 8;// this is equal to number = number + 8;
        System.out.println("Addition " + number);//2353
        number /= 3; // this is equal to number = number /3;
        System.out.println("division " + number);//784
        number %= 5; // this is equal to number = number %5;
        System.out.println("modulous " + number);//4
        number *= 5;// this is equal to number = number * 5;
        System.out.println("multiplication " + number);//20
	}
}
