package methods;
import java.util.*;
public class bank {
	       static int currentBalance=1000;
	public static void greetingcustomer() {
		System.out.println("welcome to banking application");	}
    public static void deposit(int amount) {
    	currentBalance=currentBalance+amount;
    	System.out.println("your deposited successfully"+currentBalance);	
    }
    public  void withdrawl(int amount) {
    	currentBalance = currentBalance-amount;
    	System.out.println("your withdrawl successfully"+currentBalance);	
    }
    public int getCurrentBalance() {
    	return currentBalance;
    }
public static void main(String args[]) {
	bank bank=new bank();
	greetingcustomer();
	bank.deposit(500);
	System.out.println("your current balance:"+bank.currentBalance);	
	bank.withdrawl(1000);
	System.out.println("your current balance:"+bank.currentBalance);	

}
}
