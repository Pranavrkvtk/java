import java.util.*;
class Publisher
{
	String name;
	Scanner k =new Scanner(System.in);
	Publisher()
	{
		System.out.println("enter Publisher Name");
		name = k.next();
	}
}
class Book extends Publisher
{
	String bName;
	Book()
	{
		System.out.println("enter Book name=");
		bName = k.next();
	}
}
class Literature extends Book
{
	void display()
	{
		System.out.println(name+" "+bName);
	}
}

class Fiction extends Book
{
	void display()
	{
		System.out.println(name+" "+bName);
	}
}
class Library
{
	public static void main(String a[])
	{
		Scanner p = new Scanner(System.in);
		Literature[] lList = new Literature[20];
		Fiction[] fList = new Fiction[20];
		int n,i,ch;
		System.out.println("Enter length of books");
		n=p.nextInt();
		int li=0,fi=0;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter 1 to Literature or 0 to Fiction =");
			ch = p.nextInt();
			if(ch == 1)
			{
				lList[li] = new Literature();
				li++;
				
			}
			else if(ch == 0)
			{
				fList[fi] = new Fiction();
				fi++;
			}
			else
			{
				System.out.println("enter correct input");
				i--;
			}
			
		}
		System.out.println("to sho list of fiction enter 1 or 0 to literature");
		int ll = p.nextInt();
		if(ll ==1)
		{
			System.out.println("List of Fiction");
			for(i=0;i<=fi;i++)
			{
				fList[i].display();
			}
		}
		else if(ll == 0)
		{
			System.out.println("List of Literature");
			for(i=0;i<=li;i++)
			{
				lList[i].display();
			}
		}
		else
		{
			System.out.println("wrong choice");
		}
		
	}
}
