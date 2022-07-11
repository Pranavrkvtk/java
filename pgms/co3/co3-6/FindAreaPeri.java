import java.util.*;
interface Shape
{
	public void area();
	public void perimeter();
}
class Circle implements Shape
{
	Scanner k = new Scanner(System.in);
	int r;
	Circle()
	{
		System.out.println("enter radius =");
		r= k.nextInt();
	}
		
	public void area()
	{
		
		double area = 3.14*r*r;
		System.out.println("area of a circle = "+area);
	}
	public void perimeter()
	{
		double peri = 2*3.14*r;
		System.out.println("Perimeter of a circle = "+peri);
	}
}
class Rectangle implements Shape
{
	Scanner d = new Scanner(System.in);
	int w,l;
	Rectangle()
	{
		System.out.println("enter width of rectangle = ");
		w = d.nextInt();
		System.out.println("enter lenght of the rectangle =");
		l= d.nextInt();
	}
	public void area()
	{
		double area=w*l;
		System.out.println("Area of rectangle = "+area);
	}
	public void perimeter()
	{
		double peri=2*(l+w);
		System.out.println("Perimeter of rectangle = "+peri);
	}
}
class FindAreaPeri
{
	public static void main(String aa[])
	{
		while(true)
		{
			System.out.println("enter your choice");
			System.out.println("1.Circle \n2.Rectangle\n3.exit");
			Scanner c= new Scanner(System.in);
			int ch = c.nextInt();
			switch(ch)
			{
				case 1:Circle cc = new Circle();
				cc.area(); cc.perimeter();
					break;
				case 2:Rectangle rr = new Rectangle();
					rr.area(); rr.perimeter();
					break;
				case 3:System.out.println("bye....");
				System.exit(0);
				default :System.out.println("wrong choice");
			}
		}
	}
}
					
	
