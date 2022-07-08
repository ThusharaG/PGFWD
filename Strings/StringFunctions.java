package Strings;
public class StringFunctions {

	public static void main(String args[])
	{
		String str1 = "String functions ";
		String str2 = "String functions Program";
		
		System.out.println(str1.charAt(6));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str2));
		System.out.println(str2.endsWith("Program"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.trim());
		System.out.println(str1.startsWith("String"));
		
	}
	
}
