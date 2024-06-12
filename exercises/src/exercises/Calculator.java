package exercises;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n1 = sc.nextInt();
	System.out.println("enter  number:"+n1);
	int n2 = sc.nextInt();
	System.out.println("enter  number:"+n2);
	System.out.println("enter operator");
	Scanner input= new Scanner(System.in);
	int operator=input.next().charAt(0);
	
	switch(operator)	
	{
	case '+' :
		int add = n1+n2;
		System.out.println("Addition :"+add);
		break;
	case '-':
	   int sub = n1-n2;
	   System.out.println("Subtraction :"+sub);
	   break;
	case '/':
	float div = n1/n2;
	System.out.println("Division :"+div);
	break;
	case '*':
		int mul=n1*n2;
	System.out.println("Multiplication :"+mul);
	break;
	case '%' :
		float mod = n1%n2;
		System.out.println("module:"+mod);
		break;
	default:
	System.out.println("enter the operator:");
	}
	}

}
