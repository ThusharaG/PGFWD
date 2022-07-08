package Collections;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		 ll.add("May");
		 ll.add("June");
		 ll.add("August");
		 ll.add("April");
		 ll.add("November");
		 ll.addLast("December");
		 ll.addFirst("January");
		 ll.set(2, "February");
		 ll.set(3, "March");
		 ll.set(9,"September");
		 ll.set(10, "October");
		 
		 Iterator itr = ll.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println("Linked List"+itr.next());
			 if(ll.indexOf("itr.next()"))
		 }
		 
		 

	}

}
