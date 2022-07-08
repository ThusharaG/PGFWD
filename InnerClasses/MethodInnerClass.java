package InnerClasses;
class Outer1
{
	static class Inner
	{
		public void dis()
			{
				System.out.println("This is from inner Dis");
			}
	}
	Inner o1 = new Inner();
}
public class MethodInnerClass {
	public static void main(String args[])
	{
		Inner o1 = new Inner();
		
	}

}
