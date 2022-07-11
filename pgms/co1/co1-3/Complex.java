import java.io.*;
import java.util.*;
class Complex{
	public static void main(String a[])
	{
		Scanner k = new Scanner(System.in);
		int r1,r2,i1,i2,r3,i3;
		System.out.println("Enter real value and image value of first complex number");
		r1 = k.nextInt();
		i1 = k.nextInt();
		System.out.println("Enter real value and image value of second complex number");
		r2 = k.nextInt();
		i2 = k.nextInt();
		r3 = r1+r2;
		i3 = i1+i2;
		System.out.println(r3+" + i"+i3);
		
	}
}
