package Collections;
import java.util.*;
import java.util.function.*;

class MyConsumer<T> implements Consumer<T>
{
	public void accept(T ctask)
	{
		System.out.println("the value of ctask"+ctask);
		System.out.println("Adding 5 to ctask"+ ((int)ctask+5));
	}
}
public class UtilityDemo {
public static void main(String args[])
{
	MyConsumer mcon;
	ArrayList<Integer> myList = new ArrayList<>(5);
	mcon = new MyConsumer();
	myList.add(100);
	myList.add(200);
	myList.add(300);
	myList.add(400);
	myList.add(500);
	
	myList.forEach(mcon);
	
	
	
}
}
