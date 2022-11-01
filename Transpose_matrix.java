package Mentor_practice;

public class Transpose_matrix {

	public static void main(String[] args)
	{
		int i,j;
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]b=new int[3][3];
		
		System.out.println("Elements in without transpose");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Elements in transpose form");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				b[i][j]=a[i][j];
				
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
