package Mentor_practice;
import java.util.*;
public class Sort_array 
{
	 Scanner sc=new Scanner(System.in);
	 int []a=new int[10];
	 int i,j,k;
	Sort_array ()
	{
		System.out.println("Enter elements in array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
	public void disp()
	{
		System.out.println("Sorted array is");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					k=a[j];
					a[j]=a[i];
					a[i]=k;
				}
			}
		}
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

	public static void main(String[] args) {
		Sort_array ob=new Sort_array ();
		ob.disp();

	}

}
