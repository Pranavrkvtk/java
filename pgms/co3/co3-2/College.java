import java.util.*;
class Employee
{
	Scanner k = new Scanner(System.in);
	int Salary,Empid;
	String Name,Addr;
	Employee()
	{
		System.out.println("enter employee id=");
		Empid = k.nextInt();
		System.out.println("enter employee name = ");
		Name = k.next();
		System.out.println("Enter Salary = ");
		Salary = k.nextInt();
		System.out.println("Enter Address = ");
		Addr = k.next();
	}
}
class Teacher extends Employee
{
	String dept,sub;
	Teacher()
	{
		System.out.println("enter Department = ");
		dept = k.next();
		System.out.println("enter subject = ");
		sub = k.next();
	}
	void display()
	{
		System.out.println(Empid+" "+Name+" "+Salary+" "+Addr+" "+dept+" "+sub+"\n");
	}
}
class College
{
	public static void main(String aa[])
	{
		Scanner p = new Scanner(System.in);
		int n,i;
		Teacher[] list = new Teacher[20];
		System.out.println("enter length of the employees = ");
		n = p.nextInt();
		System.out.println("enter Employee Details");
		for(i=0;i<n;i++)
		{
			list[i] = new Teacher();
		}
		System.out.println("Details of the employees");
		for(i=0;i<n;i++)
		{
			list[i].display();
		}
	}
}
