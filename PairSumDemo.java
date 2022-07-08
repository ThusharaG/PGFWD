
public class PairSumDemo {
	
	public void pairSum(int num[],int target)
	{
		for(int i=0;i<num.length;i++)
		{
			int j=0;
			if(target==(num[i]+num[j]))
			{
				System.out.println("The correct pair for sum is"+num[i]+" "+num[j]);
			}
			j++;
				
		}
		
	}

}
class PairSumDemo2
{
public static void main(String args[])
{
	PairSumDemo p1 = new PairSumDemo();
	int a[]={5,3,2,8,9,1,7,6};
	p1.pairSum(a,12);
}
}

	


