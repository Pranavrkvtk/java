import java.util.*;
class Symmetric{
	public static void main(String a[])
	{
		int r1,c1,i,j;
		Scanner k = new Scanner(System.in);
		System.out.println("enter first matrix row and column value");
		r1 = k.nextInt();
		c1 = k.nextInt();
		int m1[][] = new int[10][10];
		System.out.println("enter first matrix values");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				m1[i][j]=k.nextInt();
			}
		}
		System.out.println("transpose of the matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(m1[j][i]+"\t");
			}
			System.out.println("");
		}
		int f=0;
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				if(m1[i][j] != m1[j][i])
				{
					f=1;
				}
			}
		}
		if(f==1)
		{
			System.out.println("Matrix not symmetric");
		}
		else
		{
			System.out.println("Matrix is symmetric");
		}
	}
}
