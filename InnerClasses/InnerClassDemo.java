package InnerClasses;
class Outer
{
	private int age=20;
	
	public void dis()
	{
		System.out.println("This is from outer Dis");
	}
	
	class Inner
	{
		public void dis()
		{
			System.out.println("This is from inner Dis"+age);
		}
	}
}
public class InnerClassDemo {
	public static void main(String args[])
	{
		Outer o1 = new Outer();
		Outer.Inner i1 = o1.new Inner();
		i1.dis();
		o1.dis();
	}

}
