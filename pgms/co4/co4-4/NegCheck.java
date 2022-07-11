import java.util.*;
class negative extends Exception{}
class NegCheck
{
	public static void main (String ssd[])
	{
		try
		{
		
			Scanner k =new Scanner(System.in);
			System.out.println("enter length of the list = ");
			int n = k.nextInt();
			System.out.println("enter the numbers=");
			int s=0,num;
			for(int i=0;i<n;i++)
			{
				num = k.nextInt();
				if (num < 0)
				{
					throw new negative();
				}
				s+=num;
			}
			float avg = s/n;
			System.out.println("Average of N integer number = "+avg);
			}
			catch (negative l)
			{
				System.out.println("enter positive  number");
			}
			
			
	}
}
