import java.util.*;
class Person
{
	Scanner k = new Scanner(System.in);
	int Age;
	String Name,Gender,Address;
	Person()
	{
		System.out.println("enter employee name = ");
		Name = k.next();
		System.out.println("enter employee Gender = ");
		Gender = k.next();
		System.out.println("enter employee Address = ");
		Address = k.next();
		System.out.println("enter employee Age = ");
		Age = k.nextInt();
	}
}
class Employee extends Person
{

	int Salary,Empid;
	String cmpName,Qual;
	Employee()
	{
		System.out.println("enter employee id=");
		Empid = k.nextInt();
		System.out.println("enter employee company name = ");
		cmpName = k.next();
		System.out.println("enter employee Qualification = ");
		Qual = k.next();
		System.out.println("Enter Salary = ");
		Salary = k.nextInt();
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
		System.out.println(Empid+" "+Name+" "+Gender+" "+Address+" "+Age+" "+cmpName+" "+Qual+" "+Salary+" "+dept+" "+sub+"\n");
	}
}
class Company
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
