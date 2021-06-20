package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("input.txt");
			 
			 int i =fis.read();
			 System.out.println((char)i);
			 i =fis.read();
			 System.out.println((char)i);
			 i =fis.read();
			 System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");

	}

}
