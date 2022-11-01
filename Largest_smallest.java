package Mentor_practice;
import java.util.*;
public class Largest_smallest 
{
	Scanner sc=new Scanner(System.in);
	int [] a=new int[5];
	int i;
	
	
	Largest_smallest()
	{
		
		System.out.println("Enter elements in array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
     public void logic_max()
     {
    	 int max=0;
    	 for(i=0;i<a.length;i++)
    	 {
    		 if(max<a[i])
    		 {
    			 
    			 max=a[i];
    		 }
    	 }
    	 System.out.println("largest nuber in array is = :"+max);
     }
     
     public void logic_min()
     {
    	 int minvalue=0;
    	 for(i=0;i<a.length;i++)
    	 {
    		 if( a[i]<minvalue)
    		 {
    			 
    			minvalue=a[i];
    		 }
    	 }
    	 System.out.println("Smallest nuber in array is = :"+minvalue);
     }
	public static void main(String[] args) {
		Largest_smallest ob=new Largest_smallest();
		ob.logic_max();
		ob.logic_min();

	}

}
