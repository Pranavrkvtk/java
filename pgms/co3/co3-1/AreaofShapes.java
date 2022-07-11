import java.util.*;
class Area{
 void Shape(int r)
 {
 	System.out.println("Area of circle = "+(3.14*(r*r)));
 }
 void Shape(int b,int h)
 {
 	System.out.println("Area of Triangle  = "+((b*h)/2));
 }
}
class AreaofShapes
{
	public static void main(String aa[])
	{
		int r,b,h;
		Scanner k =new Scanner(System.in);
		System.out.println("enter radius=");
		r=k.nextInt();
		System.out.println("enter breadth and height");
		b=k.nextInt();
		h=k.nextInt();
		Area ll= new Area();
		ll.Shape(r);
		ll.Shape(b,h);
	}
}
