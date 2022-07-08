package Collections;
import java.util.Collections;
import java.util.TreeSet;
public class TreeSetEx {
	public static void main(String args[]) 
	{
		TreeSet ts = new TreeSet();
		ts.add("C-Programming");
		ts.add("C++");
		ts.add("Java");
		ts.add("Python");
		ts.add("Dot net");
		ts.add("COBOL");
		
		System.out.println(ts);
		System.out.println("Size of TreeSet"+ts.size());
		ts.remove("COBOL");
		ts.remove("C-Programming");
		System.out.println("After removal"+ts);
		ts.add("JQuery");
		ts.add("Bootstrap");
		System.out.println("Tree Set after adding "+ts);
		System.out.println("Tree Set contains Java"+ts.contains("Java"));
		ts.clear();
		System.out.println("TreeSet after clear"+ts);
		
	
	}
}
