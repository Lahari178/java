import java.util.*;
public class negativePositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println(a+ "is positive");
		}
		else if(a<0)
		{
            System.out.println(a+ "is equal to zero");
	}
		else
		{
			System.out.println(a+ "is negative");
		}
		
	}
}
