package Mentor_practice;
import java.util.*;
public class Copy_array 
{
	
	Scanner sc=new Scanner(System.in);
	
	int[] a=new int[10];
	int[]b=new int[a.length];
	int i;
	Copy_array()
	{
		System.out.println("Enter elements in array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
			
	}
	public void disp()
	{
		b=a;
		System.out.println(" copy reverse array ");
		for(i=b.length-1;i>=0;i--)
			System.out.println(b[i]);
	}

	public static void main(String[] args)
	{
		Copy_array ob=new Copy_array ();
		ob.disp();
		

	}

}
