package FileHandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingEx {
	public static void main(String args[])
	{
		Scanner s1= new Scanner(System.in);

		System.out.println("Please enter the data to be entered into the file\n");
		String data = s1.nextLine();
		System.out.println(data);
		
		try {
		FileWriter f1 = new FileWriter("D:\\PGFWD\\newfile2.txt");
		f1.write(data);
		f1.close();
		System.out.println("Data has been successfully written into the file");
		FileReader f2 = new FileReader("D:\\PGFWD\\newfile2.txt");
		char a[]=new char[60];
		f2.read(a);
		f2.close();
		System.out.println("Data has been sucessfully read from the file");
		System.out.println("Data in the file");
		System.out.println(a);
		}catch(IOException ie)
		{
			ie.printStackTrace();
		}

	}
}
