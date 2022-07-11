import java.io.*;

class Cpu{
int price = 6584;
class Processor{

void display()
{
int nC = 8;
String mnftr = "AMD RYZEN";
String origin="india";
System.out.println("number of cores="+nC);
System.out.println("manufatured="+mnftr);
System.out.println("made in"+origin);
}


}
class Ram{
void display()
{
int mry = 8;
String mnftr = "Samsung";
System.out.println("memory="+mry);
System.out.println("manufactured="+mnftr);

}

}
}

class Mi{
public static void main(String f[]){
Cpu k = new Cpu();
Cpu.Processor p = k.new Processor();
Cpu.Ram l = k.new Ram();
System.out.println("Price = "+k.price);
p.display();
l.display();


}
}
