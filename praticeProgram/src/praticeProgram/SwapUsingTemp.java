package praticeProgram;
import java.util.*;
public class SwapUsingTemp {

	public static void main(String[] args) {
		
		//without using scanner class
		/*int t;
		int a=100;
		int b=250;
		System.out.println("Before swapping :");
		System.out.println(a);
		System.out.println(b);
		t=a;
		a=b;
		b=t;
		System.out.println("after swapping :");
		System.out.println(a);
		System.out.println(b);*/
		
	//using scanner class
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of a:");
	    int a=sc.nextInt();
	    System.out.println("enter the value of b:");
	    int b=sc.nextInt();
	    int t;
	    t=a;a=b;b=t;
	    System.out.println("a:"+a);
		System.out.println("b:"+b); 

	}

}
