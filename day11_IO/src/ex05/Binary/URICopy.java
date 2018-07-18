package ex05.Binary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class URICopy {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.google.co.kr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
		InputStream in = url.openStream();//���ܹ߻� - ó����
		OutputStream os = new FileOutputStream("google.png"); // �����
		byte[] buffer = new byte [1024*8];
	
		while(true){
			int inputData = in.read(buffer);
			if(inputData==-1) break;
			os.write(buffer,0,inputData); // bufferũ�⿡�� 0���� inputData��ŭ �о��.
		}// end while
		
		in.close();
		os.close();
		System.out.println("������ ���� ���翡 �����Ͽ����ϴ�.");
	}
}
