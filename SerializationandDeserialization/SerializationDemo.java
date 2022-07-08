package SerializationandDeserialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class SerializationDemo {
static String fileName = "new_students.ser";

static class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	
	public Student(int id,String name)
	{
		super();
		this.id=id;
		this.name = name;
	}
	
public String toString()
{
	return "Student [id=" + id +", name="+name+"]";
	
}
}
static void SerializieObject()
{
	Student johnDoe = new Student(1,"John Doe");
	try {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
		out.writeObject(johnDoe);
		out.flush();
		out.close();
		
		System.out.println("Writing successful");
	}catch (IOException e) {
		e.printStackTrace();
		
	}
}
}

