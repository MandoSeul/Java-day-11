package ex05.Binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		//읽기 객체 - FileInputStream
		InputStream in = new FileInputStream("yuna.jpg"); // 파일 읽기 그릇 생성
		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("queenyuna.jpg");
		byte[] buffer = new byte [1024*8];
		long start = System.currentTimeMillis();
		while(true){
			int inputData = in.read(buffer);
			if(inputData==-1) break;
			os.write(buffer,0,inputData); // buffer크기에서 0부터 inputData만큼 읽어라.
		}// end while
		long end = System.currentTimeMillis();
		System.out.println(end-start); // 파일복사 걸린 시간
		in.close();
		os.close();
		System.out.println("copy success");
	}
}
