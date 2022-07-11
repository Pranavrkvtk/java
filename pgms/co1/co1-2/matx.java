import java.util.Scanner;
import java.io.*;
class matx{
	public static void main(String a[])
	{
		Scanner k =new Scanner(System.in);
		int r1,c1,i,j,s=0;
		int m1[][] = new int[10][10];
		System.out.println("enter first matrix row and column value");
		c1=k.nextInt();
		r1=k.nextInt();
		System.out.println("enter first matrix values");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				m1[i][j]=k.nextInt();
			}
		}
		{
		System.out.println("matrix is");
		for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					s = m1[i][j];
					System.out.print(s+"\t");
				}
				System.out.println("");
		        }
		}
	}
}		
