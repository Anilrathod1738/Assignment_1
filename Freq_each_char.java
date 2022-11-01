package Mentor_practice;
import java.util.*;
public class Freq_each_char 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int lock=-1;
		int count=0;
		String s;
		System.out.println("Enter String");
		s=sc.nextLine();
		
		
		
		char[]ch=s.toCharArray();
		int[]a=new int[ch.length];
		
		for(i=0;i<ch.length;i++)
		{
			count=1;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					
					count++;
					a[j]=lock;
				}
			}
			if(a[i]!=lock)
			{
				a[i]=count;
			}
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=lock)
			{
				System.out.println(ch[i]+" "+a[i]);
			}
		}

	}

}
