package ExceptionHandling;
//import java.io.
public class CustException {
public void checkSal(int sal) throws InvalidSalException
{
	if(sal<2100)
	throw new InvalidSalException("you need to work hard");
	else if(sal>=2100||sal<=5000)
		throw new InvalidSalException("your salary is somehow good");
	else if(sal>=5100||sal<=9000)
		throw new InvalidSalException("your salary is good");
	
}
public static void main(String args[]) throws InvalidSalException
{
	CustException obj = new CustException();
	try {
		obj.checkSal(5100);	
	}catch(Exception e)
	{
		System.out.println("an Exception has occured"+e.getMessage());
	}
	
}
}

class InvalidSalException extends Exception
{
	InvalidSalException(String s)
	{
		super(s);
	}
}