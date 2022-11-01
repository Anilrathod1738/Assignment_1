package Mentor_practice;
import java.util.*;
public class Sum_of_rows {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		    
	      int row,col;
	      int sum;
	      int[][] a=new int[3][3];

	 System.out.println("Enter elements in array ");
	  
	  for(row=0;row<3;row++)
	     {
	      for(col=0;col<3;col++)
	         a[row][col]=sc.nextInt();
	      }
	        
		System.out.println("Element printing in matrix form  ");
	    	for(row=0;row<3;row++)
	    	 {
	      		for(col=0;col<3;col++)
	        		System.out.print(a[row][col]+" ");

	           System.out.println();
	          }
         
         for(row=0;row<3;row++)
	     {
       	  sum=0;
	      for(col=0;col<3;col++)
	      {
	        sum=sum+a[row][col];
	      }
	      System.out.println("sum of  "+(row+1)+"row "+sum);
	}


	}

}
