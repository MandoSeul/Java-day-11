package ex03.stringbufferIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		Reader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));	
		
		System.out.println("charactor input : ");
		String str = br.readLine(); // 예외가 발생. throws IOexception //// 예외처리. 여러개의 데이터 입력받기
		System.out.println(str);
	}
}
