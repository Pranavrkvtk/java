import java.io.*;

class Shop{
	public static void main(String a[])
	{
		Product k = new Product();
		Product j = new Product();
		Product l = new Product();
		k.pcode = 123;
		k.price = 45;
		k.pname = "Book";
		j.pcode = 234;
		j.price = 10;
		j.pname = "pen";
		l.pcode = 456;
		l.price = 88 ;
		l.pname = "Water Bottle";
		System.out.println("Name = "+k.pname+" Code = "+k.pcode+" price ="+k.price);
		System.out.println("Name = "+l.pname+" Code = "+l.pcode+" price ="+l.price);
		System.out.println("Name = "+j.pname+" Code = "+j.pcode+" price ="+j.price);
		System.out.println("Lowest Price");
		if(k.price < l.price && k.price < j.price)
		{
			System.out.println("Name = "+k.pname+" Code = "+k.pcode+" price ="+k.price);
		}
		else if(l.price < j.price)
		{
			System.out.println("Name = "+l.pname+" Code = "+l.pcode+" price ="+l.price);
		}
		else
		{
			System.out.println("Name = "+j.pname+" Code = "+j.pcode+" price ="+j.price);
		}
	}
}
class Product{
int pcode;
int price;
String pname;
}
