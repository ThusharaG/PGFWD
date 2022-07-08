package Collections;
import java.util.Collection;
import java.util.LinkedHashSet;
public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Jushya");
		lhs.add(10);
		lhs.add(20);
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();
		lhs2.add(1);
		lhs2.add(2);
		lhs2.add(3);
		lhs2.add(4);
		lhs2.add(5);
		lhs2.add(6);
		lhs2.add(7);
		lhs2.add(8);
		System.out.println(lhs);
		System.out.println(lhs2);
	}

}
