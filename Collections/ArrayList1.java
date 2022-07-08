package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) 
	{
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Keshava");
		l1.add("Madhava");
		l1.add("Raghava");
		String names[] = new String[5];
		
		names[0]="Krishna";
		names[1]="Rama";
		names[2]="Raghava";
		names[3]="SriRama";
		names[4]="Sitapathi";
		
		List<String> name = Arrays.asList(names);
		
		System.out.println("String Array List"+l1);
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		System.out.println("Integer Array List"+l2);
		l2.remove(2);
		
		System.out.println("After removal"+l2);
		
		//ArrayList<>
		
		}

}
