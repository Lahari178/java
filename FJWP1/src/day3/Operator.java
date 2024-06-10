package day3;
import java.util.Scanner;
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("add="+c);
		c=a-b;
		System.out.println("sub="+c);
		c=a*b;
		System.out.println("mul="+c);
		c=a/b;
		System.out.println("div="+c);
		c=a%b;
		System.out.println("mod="+c);
		
	}

}
	
