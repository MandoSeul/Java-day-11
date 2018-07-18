package ex04.FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//OutputStream os = new FileOutputStream("sample.txt"); // ����� + ���ܹ߻���
			OutputStream os = new FileOutputStream("C:/Users/PBL-14/hi.txt");
			while(true){
				System.out.println("���ڿ� �Է� ��� : ");
				String str = sc.nextLine() + "\r\n";
				
				if(str.equalsIgnoreCase("EXIT\r\n")) break;
				// = if(str.toUpperCase().equals("EXIT\r\n")) break;
				os.write(str.getBytes()); // ���� �߻� �о���� ���� str�� ����(getBytes)
				System.out.println(str);
				
			}//end while
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
