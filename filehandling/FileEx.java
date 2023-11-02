package filehandling;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args)throws IOException {
		File newFile = new File("C:/Users/ASUS/eclipse-workspace/javaprograms/src/exception/s.pdf");
		if(newFile.createNewFile()) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file exist");
		}
		
		System.out.println("absolute path"+newFile.getAbsolutePath());
		File newFile1 = new File("D:/File/courses2.txt");
		if(newFile1.createNewFile()) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file exist");
		}
		System.out.println("relative path"+newFile1.getCanonicalPath());
		System.out.println("absolute path"+newFile1.getAbsolutePath());
		System.out.println("RW:"+newFile.canRead());
		System.out.println("Read write:"+newFile.canWrite());
		System.out.println("File name:"+newFile.getName());
		
		System.out.println(newFile.getParent());
		
		File newFileF2 = new File("D:/File/oops.txt/");//relative
		String[] list = newFileF2.list();
		
		
		if(newFile.createNewFile()) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file exist");
		}

	}

}
