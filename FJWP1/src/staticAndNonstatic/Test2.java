package staticAndNonstatic;

public class Test2 {
	int number=10;
     static {
      System.out.println("static block");	
    	
     }
     {
    	 System.out.println("Non-static block");
     }
     public Test2(){
    	 System.out.println("constructor");
    	 
     }
	public static void main(String[] args) {
		System.out.println("main method");
		new Test2();
		
		
	}

}
