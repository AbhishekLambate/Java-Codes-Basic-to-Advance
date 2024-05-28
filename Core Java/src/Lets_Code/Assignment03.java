package Lets_Code;

public class Assignment03 {

	public static void main(String[] args) {
		/*
		 * Assignment - 03 Print the following pattern on the screen
		 *****
		 *** 
		 * 
		 *** 
		 ***** */
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=)
//		}
		for (int r1 = 1; r1 <=3; r1++) {
            for (int c1 = 1; c1 <=r1 ; c1++) {
                System.out.print(" ");
            }


            for (int c2 = 5; c2>0 ; c2--) {
                if ((r1==2&&(c2==3||c2==2||c2==1))||(r1==3&&(c2==1||c2==2||c2==3||c2==4))){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }


            }
            System.out.println();
        }
        for (int r2 = 2; r2 >0 ; r2--) {
            for (int c3 = 1; c3 <= r2; c3++) {
                System.out.print(" ");
            }
            for (int c4 = 5; c4 >0 ; c4--) {
                if (r2==2&&(c4==3||c4==2||c4==1)){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

	}

}
