package SerializationandDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class SerialDemo implements java.io.Serializable
{
	int a;
	String b;
	SerialDemo(int a,String b)
	{
		this.a = a;
		this.b = b;
	}
}

class SerializationEx
{
	public static void main(String args[])
	{
		//Serialization process
		SerialDemo sd = new SerialDemo(12,"Hello");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\PGFWD\\Student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(sd);
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		}
		
		//Deserialization process
		
		SerialDemo s2 = null ;
		try {
			FileInputStream fis = new FileInputStream("D:\\\\PGFWD\\\\Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s2 =(SerialDemo)ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
	}
}
