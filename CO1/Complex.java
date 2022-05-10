public class complex
{
  int real;
  int image;
 public complex(int real_get,int img_get)
 {
  this.real=real_get;
   this.image=img_get;
}
  public static complex sum(complex c1,complex c2)
 {
   complex temp=new complex(0,0);
   temp.real=c1.real+c2.real;
   temp.image=c1.image+c2.image;
   return temp;
}
public static void main(String args[])
{
 complex first=new complex(1,2);
 complex second=new complex(32,22);
 complex temp =sum(first,second);
 System.out.println("Sum is:"+temp.real+ "+" + temp.image + "i");
}
}

