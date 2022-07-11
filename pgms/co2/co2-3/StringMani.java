	import java.util.*;
	class StringMani{
	public static void main(String a[])
	{
		Scanner k = new Scanner(System.in);
		char[] n = {'c','o','l','l','e','g','e'};
		String s = new String(n);
		int l = s.length();
		String c = " hello ";
		String d = c.concat(s);
		String lo = d.toLowerCase();
		String up = lo.toUpperCase();
		String tr =up.trim();
		boolean i = s.isEmpty();
		System.out.println(s+"\n length of the string= "+l+"\n"+d+"\n lower case ="+lo+"\n upper case "+up+"\n trim = "+tr+"\n is the string empty ="+i);
		
		
	}
	}
