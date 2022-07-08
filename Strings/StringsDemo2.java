package Strings;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class StringsDemo2 {

	public static void main(String args[])
	{
		String nameArray[]=new String[5];
		
		nameArray[0]="Keshava";
		nameArray[1]="Madhava";
		nameArray[2]="Kishore";
		nameArray[3]="Krishna";
		nameArray[4]="HareKrishna";
		
		List<String> names=Arrays.asList(nameArray);
		
		Collections.sort(names);
		
		System.out.println("Sorted names"+names);
		
		
		
	}
}
