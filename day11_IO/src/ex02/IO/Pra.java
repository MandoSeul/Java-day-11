package ex02.IO;

import java.io.IOException;
import java.io.InputStream;

public class Pra {
	public static void main(String[] args) throws IOException {
		int i, j;
		int result = 0;
		InputStream in = System.in;
		System.out.println("����  ���ڵ��� �Է��Ͻÿ� : ");
		i=(char) in.read()-48; in.read();in.read(); j=(char)in.read()-48;
		System.out.println("��Ģ������ �Է��Ͻÿ� : ( *, / , +, - ) ");
		in.read();in.read();
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
