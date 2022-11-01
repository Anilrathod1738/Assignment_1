package Mentor_practice;
import java.util.*;
public class Second_max_elements 
{
	 Scanner sc=new Scanner(System.in);
	 int[]a=new int[5];
	 int i,j,k;
	Second_max_elements()
	{
		System.out.println("Enter elements in array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
			}
			
		}
		System.out.println("sorted array is");
		for(i=0;i<a.length;i++)
		System.out.println(a[i]);
			System.out.println("second max"+a[1]);
			
		
		
	}
	
	
	public static void main(String[] args)
	{
		Second_max_elements ob=new Second_max_elements();
             
	}

}
