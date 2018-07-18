package ex05.Binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		//�б� ��ü - FileInputStream
		InputStream in = new FileInputStream("yuna.jpg"); // ���� �б� �׸� ����
		//���� ��ü - FileOutputStream
		OutputStream os = new FileOutputStream("queenyuna.jpg");
		byte[] buffer = new byte [1024*8];
		long start = System.currentTimeMillis();
		while(true){
			int inputData = in.read(buffer);
			if(inputData==-1) break;
			os.write(buffer,0,inputData); // bufferũ�⿡�� 0���� inputData��ŭ �о��.
		}// end while
		long end = System.currentTimeMillis();
		System.out.println(end-start); // ���Ϻ��� �ɸ� �ð�
		in.close();
		os.close();
		System.out.println("copy success");
	}
}
