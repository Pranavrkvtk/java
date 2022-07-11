import java.util.*;
interface Student
{
	public void acadamic();

}
interface Sports
{
	public void sDetails();
}
class Result implements Student,Sports
{
			Scanner d = new Scanner(System.in);
			String name,std;
			int mark,score;
	Result()
	{

		System.out.println("Enter student name= ");
		 name = d.next();
		System.out.println("enter class =");
		 std = d.next();
	
	}
	public void acadamic()
	{
		System.out.println("enter total mark=");
		mark=d.nextInt();
	}
	public void sDetails()
	{
		System.out.println("enter total Sports score =");
		score=d.nextInt();
	}
	void Display()
	{
		System.out.println("Name = "+name);
		System.out.println("class = "+std);
		System.out.println("Total mark = "+mark);
		System.out.println("Total sports score = "+score);
	}
		
		 
}
public class Co5
{
	public static void main(String a[])
	{

		Result k = new Result();
		k.acadamic();
		k.sDetails();
		k.Display();
	}
}
		
		
