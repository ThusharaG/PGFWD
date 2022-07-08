package Strings;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class StringsDemo1 {
	 public static void main(String[] args)
	 {
		 int number[] = {1,2,3,4,5};
		 
		 System.out.println("***********FOR LOOP I*********");
		 
		 for(int i=0;i<number.length;i++)
		 {
			 System.out.println("Numbers Array"+number[i]);
		 }
		 
		 System.out.println("**********FOR EACH LOOP*******");
		 
		 for( int eachnumber:number)
		 {
			 System.out.println("number array"+eachnumber);
		 }
		 
		 String namesArray[] = new String[5];
		 
		 namesArray[0]="Keshava";
		 namesArray[1]="Madhava";
		 namesArray[2]="Kishore";
		 namesArray[3]="Krishna";
		 namesArray[4]="HareKrishna";
		 
		 List<String> arrList = Arrays.asList(namesArray);
		 
		 Collections.sort(arrList);
		 
		 System.out.println("sorted list"+arrList);
		 
		 
		 
	 }

}
