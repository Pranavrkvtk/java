import java.util.Scanner;

class Employee{
int EmpId;
String Name,Address;
double Salary;

Employee(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Emp Id");
EmpId=Integer.parseInt(sc.nextLine());
System.out.println("Enter Emp Name");
Name=sc.nextLine();
System.out.println("Enter Salary");
Salary=Integer.parseInt(sc.nextLine());
System.out.println("Enter the Address");
Address=sc.nextLine();
}
}

class Teacher extends Employee{
String Department,Subject;

Teacher(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Department");
Department=sc.nextLine();
System.out.println("Enter the Subject");
Subject=sc.nextLine();
}
 void Display(){
System.out.println("Emp Id is "+EmpId);
System.out.println("Emp Name is "+Name);
System.out.println("Emp salary is "+Salary);
System.out.println("Emp address is "+Address);
System.out.println("Department is "+Department);
System.out.println("Subject is "+Subject);
}
}
public class Staff{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of teachers");
num=sc.nextInt();
Teacher[] teacher=new Teacher[num];
for(int i=0;i<num;i++)
{
teacher[i]=new Teacher();
}
System.out.println("Details of teachers");
for(int i=0;i<num;i++){
System.out.println();
teacher[i].Display();
}
}
}



