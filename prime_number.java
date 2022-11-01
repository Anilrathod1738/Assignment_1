package Mentor_practice;

public class prime_number {

	public static void main(String[] args)
	{
		int i,n=1,count;
		while(n<=100)
		{
			count=0;
			i=2;
			while(i<=n/2)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
				i++;
			}
			if(count==0 && n!=1)
			{
				System.out.println(n+" ");
			}
			n++;
		}
	}

}
