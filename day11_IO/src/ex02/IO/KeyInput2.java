package ex02.IO;

import java.io.IOException;

public class KeyInput2 {
	public static void main(String[] args) throws IOException {
		int num1 =0, num2=0;
		System.out.println("������ �Է� ���� Ctrl + Z �� ��������. ");
		while((num1=System.in.read())!=-1){//read() - ���ܹ߻�
			System.out.print((char)num1 + "\t");
		}
		System.out.println();
	}
}
