package ex03.stringbufferIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		System.out.println("input : ");
		int num1 = Integer.parseInt( br.readLine());
		// ���ܰ� �߻�. throws IOexception // �������� ������ �Է¹ޱ�
		System.out.println("input2 : ");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println(num1+num2);
		
		
	}
}
