package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		long milliseconds = 0;
		
		try(FileInputStream fis = new FileInputStream("11.jpg");
				FileOutputStream fos = new FileOutputStream("copy.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis); //내부에 8192 바이트 배열을 가지고 있음, 읽거나 쓸때 속도가 빠름
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			milliseconds = System.currentTimeMillis();
			
			int i;
			while((i = bis.read())!=-1) {
				bos.write(i);
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
			
		}catch(IOException e){
			System.out.println(e);
		}
		
		
		System.out.println(milliseconds);
				
	}

}
