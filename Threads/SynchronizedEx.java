package Threads;
class Fact extends Thread
{
	int x;
	
	Fact(int x)
	{
		this.x=x;
	}
	public void run()
	{
			
			fact(x);
	}
	synchronized public void fact(int n){
		int fact = 1;
		for( int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("Factorial of a number  "+fact);
		
	}
}
class Sum extends Thread
{
	int a,b;
	Sum(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		sum(a,b);
	}
	synchronized public void sum(int a,int b)
	{
		System.out.println("Sum of two number "+(a+b));
	}
}
class SynchronizedEx
{
	public static void main(String args[]) {
		
		Fact t1 = new Fact(4);
		Fact t2 = new Fact(6);
		Sum t3 = new Sum(4,5);
		Sum t4 = new Sum(20,10);
		
		t2.start();
		t4.start();
		t1.start();
		t3.start();
		
	}
}
