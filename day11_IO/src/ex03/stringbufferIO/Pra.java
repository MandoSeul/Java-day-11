package ex03.stringbufferIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Pra {
	public static void main(String[] args) throws IOException {
		int i, j;
		int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		InputStream in = System.in;
		System.out.println("����  ���ڵ��� �Է��Ͻÿ� : ");
		i=Integer.parseInt(br.readLine());  j=Integer.parseInt(br.readLine());
		System.out.println("��Ģ������ �Է��Ͻÿ� : ( *, / , +, - ) ");
		char x = (char)in.read();
		if(x=='+')
			result = (i+j) ;
		else if(x=='-')
			result =(i-j);
		else if(x=='*')
			result = (i*j);
		else if(x=='/')
			result = (i/j);
		
		System.out.println(i + ""+ x+""+j+ "=" +result);
	}
}
