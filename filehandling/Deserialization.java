package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class Deserialization {
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("fileexample.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		StudentEx ob=null;
		ob=(StudentEx) ois.readObject();
		ob.display();
		System.out.println(ob.degree);
		System.out.println(ob.id);
		System.out.println(ob.name);
		ois.close();
		fis.close();

	}

	
}
