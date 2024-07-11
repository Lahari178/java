package object;

public class Test {
	int i;
	int j;
	public  Test(int i,int j) {
		this.i=i;
		this.j=j;
		
	}
	public  Test() {
		i=10;
		j=30;
	}

	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test(30,40);
		Test t3=new Test(25,50);
		
		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t3.add());
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t2==t3);
	}
		
		public int add() {
			return i+j;
		}	

	}


