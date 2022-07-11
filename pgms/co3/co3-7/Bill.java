import java.util.*;
interface Shop
{
	public void calculate(String name,int pId,int qty,int uPrice,int Total);
}
class Purchase implements Shop
{
	String name;
	int pId,qty,uPrice,Total;
	public void calculate(String name,int pId,int qty,int uPrice,int Total)
	{
		this.name = name;
		this.pId =pId;
		this.qty = qty;
		this.uPrice = uPrice;
		this.Total = Total;	
	}
	 void Print()
	{
		System.out.println("\t"+pId+" \t "+name+" \t "+uPrice+"\t  "+qty+"\t"+Total);
	}
}
class Bill
{
	public static void main(String aa[])
	{
		Scanner k = new Scanner(System.in);
		int i,j,pId,qty,uPrice,Total,netAmount=0,n;
		Purchase kk =new Purchase();
		String name;
		System.out.println("enter number of purchase =");
		n=k.nextInt();
		Purchase[] list = new Purchase[20];
		int order;
		System.out.println("enter order number = ");
		order = k.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("enter product name= ");
			name=k.next();
			System.out.println("enter product id = ");
			pId=k.nextInt();
			System.out.println("enter quntity = ");
			qty = k.nextInt();
			System.out.println("enter unit price = ");
			uPrice = k.nextInt();
			Total=qty*uPrice;
			netAmount=netAmount+Total;
			list[i]= new Purchase();
			list[i].calculate(name,pId,qty,uPrice,Total);
		}
		System.out.println("------------------------------------Bill---------------------------------------------------------");
		System.out.println("order no :"+order);
		System.out.println("Date : "+java.time.LocalDate.now());
		System.out.println("Product id\tName\tunit price\tQuantity\tTotal");
		for(i=0;i<n;i++)
		{
			list[i].Print();
		}
		System.out.println("Net amout = "+netAmount);
	}
}
