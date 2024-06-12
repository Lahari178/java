package exercises;
import java.util.*;
public class MulMatrix {
	public static void main(String[] args) {
		int[][] a=new int[3][3];		
		int[][] b=new int[3][3];
		int[][] c =new int[3][3];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the values of a:");
		for(int i =0;i<3;i++)
		{
	    for(int j=0;j<3;j++)
	    {
		a[i][j]=sc.nextInt();
	    }
		}
	System.out.println("enter the values of b:");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
		b[i][j]=sc.nextInt();
	}
	}
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
		c[i][j] = a[i][j]*b[i][j];
	}
	}
	for(int i=0;i<3;i++)
	{
		for (int j=0;j<3;j++)
		{
		System.out.print(c[i][j]+" ");
		}
		System.out.print("");
	}
	}
	}



