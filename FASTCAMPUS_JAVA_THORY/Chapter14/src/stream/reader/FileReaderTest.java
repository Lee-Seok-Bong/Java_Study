package stream.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("reader.txt"); // 바이트 단위 리더이며
		InputStreamReader isr = new InputStreamReader(fis);  //한글을 읽기 위해 inputStream사용
		int i;
		while ((i=isr.read())!=-1) {
			System.out.print((char)i);
		}
		isr.close();
	}

}
