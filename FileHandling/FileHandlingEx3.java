package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingEx3 {

	public static void main(String args[])
	{
		String data ="The new string";
		try {
			BufferedWriter b1 = new BufferedWriter(new FileWriter("D:\\PGFWD\\newfile3.txt",true));
			
			b1.write(data);
			b1.close();
			System.out.println("Data has been sucessfully written to the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
