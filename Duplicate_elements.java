package Mentor_practice;
import java.util.*;
public class Duplicate_elements
{
	Scanner sc=new Scanner(System.in);
	int []a=new int[10];
	int i,j,temp=0;
	 Duplicate_elements()
	 {
		 System.out.println("Enter elements in array");
		 for(i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 
	 }
	 public void logic() {
		 System.out.println("Duplicate elements is");
		 for(i=0;i<a.length;i++)
		 {
			 for(j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
				 {
					 
					 System.out.println(a[j]+" ");
				 }
	
			 }
		 }
	 }		
		 
			

	public static void main(String[] args)
	{
		 Duplicate_elements ob=new  Duplicate_elements();
		 ob.logic();

	}

}
