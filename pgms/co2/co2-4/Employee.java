import java.util.*;
class Details {
String name;
int eNo,salary;
	Details(String name,int eNo,int salary){
		this.name = name;
		this.eNo = eNo;
		this.salary = salary;
	}
	void display()
	{
		System.out.println(name+" "+eNo+" "+salary);
	}
}
class Employee 
{
	public static void main(String aa[])
	{
		Scanner k = new Scanner(System.in);
		int n,i,eNo,salary;
		String name;
		Details[] list;
		list = new Details[10];
		System.out.println("Enter the number of employees");
		n = k.nextInt();
		for (i=0;i<n;i++)
		{
			System.out.println("enter name=");
			name=k.next();
			System.out.println("enter eNo=");
			eNo = k.nextInt();
			System.out.println("enter Salary");
			salary = k.nextInt();
			list[i]=new Details(name,eNo,salary);	
		}
		System.out.println("search employee number");
		int se = k.nextInt();
		System.out.println("Employee details");
		for(i=0;i<n;i++)
		{
			if (list[i].eNo == se)
			{
				list[i].display();
			}
		}	
	}	
}
