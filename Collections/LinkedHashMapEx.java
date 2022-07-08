package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(1,"Mango");
		lhm.put(2,"Apple");
		lhm.put(3,"Banana");
		lhm.put(4,"Apricot");
		lhm.put(5,"Peach");
		lhm.put(5, "Papaya");
		
		System.out.println("LinkedHashMap"+lhm);
		
		for ( Integer key : lhm.keySet())
	
		{
			System.out.println(key +"\t"+lhm.get(key));
		}

		  System.out.println("\nRemove Apricot : " + lhm.remove("Apricot"));
		  System.out.println("\nRemove entry for key 7 : " + lhm.remove(7));
		  
	}

}
