package filehandling;

import java.io.FileOutputStream;


import java.io.IOException;
import java.io.ObjectOutputStream;

/*A marker interface in Java is an empty interface with no fields or methods. It has three types:
Serializable interface
Cloneable interface
Remote interface*/

public class Serialization {

	public static void main(String[] args)throws IOException {
	StudentEx ob=new StudentEx();
	ob.id=1;
	ob.name="sindhu";
	FileOutputStream fos=new FileOutputStream("fileexample.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(ob);
	oos.close();
	fos.close();
	System.out.println("data savend in the file");

	}

}
