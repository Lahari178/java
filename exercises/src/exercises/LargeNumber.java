package exercises;
import java.util.*;
public class LargeNumber {
	public static int FindLarge(int a,int b,int c)
	{
		 int large;

	        if (a >= b && a >= c) {
	            large= a;
	        } else if (b >= a && b>= c) {
	            large = b;
	        } else {
	            large = c;
	        }

	        return large;
	    }

	public static void main(String[] args) {
		int a=19;
		int b=35;
		int c=55;
		int large=FindLarge(a,b,c);
		System.out.println(large);
	}
}
