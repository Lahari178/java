package staticAndNonstatic;
import java.util.Random;
public class Test {
	int number;// without using static or NON-STATIC
	public static void main(String[] args) {
	Test t=new Test();
	t.number=new Random().nextInt();
	
	Test t1=new Test();
	t1.number=new Random().nextInt();
	
	Test t2=new Test();
	t2.number=new Random().nextInt();
	//creating object to allocate the memory to the variable.
	
	System.out.println(t.number);
	System.out.println(t1.number);
	System.out.println(t2.number);
	
	
	
	
		

	}

}
