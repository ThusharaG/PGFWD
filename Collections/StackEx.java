package Collections;

import java.util.Stack;

public class StackEx {

	public static void main(String args[])
	{
		Stack s1 = new Stack();
		s1.push("Apple");
		s1.push("Banana");
		s1.push("Orange");
		s1.push("Guava");
		s1.push("Hyderabad");
		s1.push("Delhi");
		s1.push("Jaipur");
		s1.push("Mumbai");
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push('a');
		s1.push('b');
		
		System.out.println("Elements of stack"+s1);
		
		s1.remove(2);
		s1.remove(3);
		s1.remove(10);
		s1.remove(5);
		s1.remove(7);
		
		System.out.println("Stack after removing of 5 elements"+s1);
		System.out.println("Top of stack"+s1.peek());
		s1.remove(7);
		s1.remove(6);
		System.out.println("Stack after removing of 2 elements"+s1);
		System.out.println("Index of Apple"+s1.indexOf("Apple"));
		System.out.println("Index of Delhi"+s1.indexOf("Delhi"));
		
		
		
		
	}
}
