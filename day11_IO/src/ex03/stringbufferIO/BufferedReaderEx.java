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
		String str = br.readLine(); // ���ܰ� �߻�. throws IOexception //// ����ó��. �������� ������ �Է¹ޱ�
		System.out.println(str);
	}
}
