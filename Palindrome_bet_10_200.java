package Mentor_practice;
import java.util.*;
public class Palindrome_bet_10_200 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println(" All palindrome number bet 10 to 200");
		for(int i=10;i<=200;i++)
		{
			int n=i;
			int rev=0;
			
			while(n >0)
			{
				int rem=n%10;
				rev=(rev*10)+rem;
				n=n/10;
			}
			if(rev==i)
			{
				System.out.print(i+" ");
			}
			
		}

	}

}
