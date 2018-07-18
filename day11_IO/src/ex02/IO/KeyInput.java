package ex02.IO;

import java.io.IOException;
import java.io.InputStream;

public class KeyInput {	
	public static void main(String[] args) {
		InputStream in = System.in; // 표준입력
		
		System.out.println("단일 문자 입력 : ");
		int num;
		try {
			num = in.read() - 48;
			in.read();in.read();
			int num2 = in.read()-48;
			System.out.println(num);
			System.out.println(num2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
