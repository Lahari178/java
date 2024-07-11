package methods;
import java.util.*;
public class Bank2 {
	
	static int currentBalance = 1000;
	
	public static void greetCustomer() {
		System.out.println("Welcome to the Bank ");
	}
	
	public static void deposite(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Succesfully  amount deposited  ");
	}
	
	public static void withdrawn(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Success withdrwan amount");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		greetCustomer();
		System.out.println("Enter the deposite Amount :");
		int depositeAmount = sc.nextInt();
		deposite(depositeAmount);
		System.out.println("balance is : "+currentBalance);
		System.out.println("");

		System.out.println("Enter the withdrawn Amount :");
		int withdrawnAmount = sc.nextInt();
		withdrawn(withdrawnAmount);
		System.out.println("balance is : "+currentBalance);
		
	}

}