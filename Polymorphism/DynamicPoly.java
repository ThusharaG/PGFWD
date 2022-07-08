package Polymorphism;
class Person
{
	public void Sleep()
	{
		System.out.println("This is from Person Sleep");
	}
	public void Eat()
	{
		System.out.println("This is from Person Eat");
	}
	public void Work()
	{
		System.out.println("This is from Person Work");
	}
}
class Employee extends Person
{
	public void Sleep()
	{
		System.out.println("This is from Employee Sleep");
	}
	public void Eat()
	{
		System.out.println("This is from Employee Eat");
	}
	public void Work()
	{
		System.out.println("This is from Employee Work");
	}
}
class Student extends Person
{
	public void Sleep()
	{
		System.out.println("This is from Student Sleep");
	}
	public void Eat()
	{
		System.out.println("This is from Student Eat");
	}
	public void Work()
	{
		System.out.println("This is from Student Work");
	}
}
class Teacher extends Person
{
	public void Sleep()
	{
		System.out.println("This is from Teacher Sleep");
	}
	public void Eat()
	{
		System.out.println("This is from Teacher Eat");
	}
	public void Work()
	{
		System.out.println("This is from Teacher Work");
	}
}
class OtherRole extends Person
{
	public void Sleep()
	{
		System.out.println("This is from OtherRole Sleep");
	}
	public void Eat()
	{
		System.out.println("This is from OtherRole Eat");
	}
	public void Work()
	{
		System.out.println("This is from OtherRole Work");
	}
}
public class DynamicPoly {
	public static void main(String args[])
	{
		Person p1;
		p1= new Employee();
		p1.Eat();
		
		p1.Work();
		p1 = new Student();
		//p1.Eat();
		p1.Sleep();
		//p1.Work();
		p1= new Teacher();
		p1.Eat();
		p1.Sleep();
		p1.Work();
		p1 = new OtherRole();
		//p1.Eat();
		//p1.Sleep();
		p1.Work();
	}

}
