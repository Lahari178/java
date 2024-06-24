package EXception;
import java.util.*;
public class Exception2 {

	public static void main(String[] args) {
		try
		{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your age:");
     int age=sc.nextInt();
     
	}
		catch(InputMismatchException e)
		{
			System.out.println("Wrong input");
		}
		finally
		{
			System.out.println("Your are eligible");
		}
	}

}