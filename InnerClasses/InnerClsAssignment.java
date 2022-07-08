package InnerClasses;
class OuterCls
{
	private int sal = 40000;
	
	class Perm
	{
		String code="PE01";
		double hike = 0.45;
		
		public void disSal()
		{
			System.out.println("Permanent employee sal"+((hike*sal)+sal));
		}
		public void dis()
		{
			System.out.println("Permanent employee"+"salary"+sal+"\nhike"+hike+"\ncode"+code);
		}
		
	}
	
	class TempEmp
	{
		String code="TE01";
		double hike = 0.30;
		
		public void disSal()
		{
			System.out.println("Temporary employee new sal"+((hike*sal)+sal));
		}
		public void dis()
		{
			System.out.println("Temporary Employee"+"salary"+sal+"\nhike"+hike+"\ncode"+code);
		}
		
	}
	class ContractEmp
	{
		String code="CE01";
		double hike = 0.3;
		
		public void disSal()
		{
			System.out.println("Contract employee  new sal"+((hike*sal)+sal));
		}
		public void dis()
		{
			System.out.println("Contract employee"+"salary"+sal+"\nhike"+hike+"\ncode"+code);
		}
		
	}
}
public class InnerClsAssignment {
	public static void main(String args[])
	{
	OuterCls o1= new OuterCls();
	OuterCls.Perm p1 = o1.new Perm();
	OuterCls.TempEmp p2 = o1.new TempEmp();
	OuterCls.TempEmp p3 = o1.new TempEmp();
	p1.disSal();
	p1.dis();
	p2.disSal();
	p2.dis();
	p3.disSal();
	p3.dis();
	
	}
	

}
