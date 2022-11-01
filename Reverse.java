package Mentor_practice;
import java.util.*;
public class Reverse
{
	Scanner sc=new Scanner(System.in);
	int []a=new int[10];
	int i;
	Reverse()
	{
		
		System.out.println("Enter elements in array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	public void disp()
	{
		System.out.println("Reverse array is");
		for(i=a.length-1;i>=1;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		
		Reverse ob=new Reverse();
		ob.disp();
	}

}
