package If_else;

public class Assignment10 {

	public static void main(String[] args) {
		/* If
        x = 2
       y = 5
       z = 0
       then find values of the following expressions:
       a. x == 2//true
       b. x != 5 //true
       c. x != 5 && y >= 5 //true
       d. z != 0 || x == 2  //true
       e. !(y < 10) // false*/
       int x=2;
       int y=5;
       int z=0;
       System.out.println(x==2?"true":"false");
       System.out.println(x!=5?"true":"false");
       System.out.println(x!=5&&y>=5?"true":"false");
       System.out.println(z!=0||x==2?"true":"false");
       System.out.println(!(y<10));
	}

}
