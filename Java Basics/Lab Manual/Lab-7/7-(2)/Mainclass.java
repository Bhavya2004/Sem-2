interface A
{
	int a=10;
	public void print1();
}

interface A1 extends A
{
	int b=20;
	public void print2();
}

interface A2 extends A 
{
	int c=30;
	public void print3();
}

interface A12 extends A1,A2
{
	int d=40;
	public void print4();
}

class B implements A12
{
	public void print1()
	{
	System.out.println("a= "+a);
	}
	public void print2()
	{
	System.out.println("b= "+b);	
	}
	public void print3()
	{
	System.out.println("c= "+c);
	}
	public void print4()
	{
		System.out.println("d= "+d);
	}
}


public class Mainclass
{
	public static void main(String[] args)
	{
		
		B b=new B();

		b.print1();
		b.print2();
		b.print3();
		b.print4();
	}
}