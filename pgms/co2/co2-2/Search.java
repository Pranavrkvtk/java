import java.util.*;
class Search{
	public static void main(String gokul[])
	{
		Scanner k = new Scanner(System.in);
		int i,n,s;
		int m[] = new int[10];
		System.out.println("enter list size=");
		n=k.nextInt();
		System.out.println("enter elements");
		for(i=0;i<n;i++)
		{
			m[i] = k.nextInt();
		}
		System.out.println("enter element to search=");
		s = k.nextInt();
		int p=0;
		for(i=0;i<n;i++)
		{
			if(s == m[i])
			{
				int ll = i+1;
				System.out.println("element found at "+ ll +" position");
				p=1;
			}
		}
		if(p==0)
		{
			System.out.println("element not in this array");
		}
		
	}
}
