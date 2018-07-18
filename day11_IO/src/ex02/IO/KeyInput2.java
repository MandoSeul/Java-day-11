package ex02.IO;

import java.io.IOException;

public class KeyInput2 {
	public static void main(String[] args) throws IOException {
		int num1 =0, num2=0;
		System.out.println("데이터 입력 끝은 Ctrl + Z 를 누르세요. ");
		while((num1=System.in.read())!=-1){//read() - 예외발생
			System.out.print((char)num1 + "\t");
		}
		System.out.println();
	}
}
