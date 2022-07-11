import java.util.*;
class Sort
{
	public static void main(String a[])
	{
		String b = "College of Engineering Vadakara";
		char sArray[] = b.toCharArray();
		Arrays.sort(sArray);
		
		String c = new String(sArray);
		System.out.println(b);
		System.out.println(c);
	}

}
