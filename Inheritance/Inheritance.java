package Inheritance;
class Product
{
	int id = 70;
	String name = "Amul";
	public void display()
	{
		System.out.println("name and ID"+this.id+" "+this.name);
	}
}
class A extends Product
{
	int count = 50;
	String category="butter";
	public void diplay()
	{
		super.display();
		System.out.println("Count and Category"+this.count+" "+this.category);
	}
}
class B extends Product
{
	int count = 50;
	String category="butter";
	public void display()
	{
		super.display();
		System.out.println("Count and Category"+this.count+" "+this.category);
	}	
}
class C extends Product
{
	int count = 50;
	String category="butter";
	public void display()
	{
		super.display();
		System.out.println("Count and Category"+this.count+" "+this.category);
	}	
}
class SubA extends A
{
	int price = 30;
	
	public void display()
	{
		int totalprice = this.price*super.count;
		System.out.println("Total Price"+totalprice);
		System.out.println("ID"+super.id+"name"+super.name);
	}	
}
class SubB extends B
{
	int price = 10;
	
	public void display()
	{
		int totalprice = this.price*super.count;
		System.out.println("Total Price"+totalprice);
		System.out.println("ID"+super.id+"name"+super.name);
	}	
}
public class Inheritance {
	public static void main(String args[])
	{
		SubB b1 = new SubB();
		SubA a1 = new SubA();
		A aobj = new A();
		B bobj = new B();
		b1.display();
		a1.diplay();
	}

}
