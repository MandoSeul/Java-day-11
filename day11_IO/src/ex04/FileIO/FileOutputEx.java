package ex04.FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Vector;

public class FileOutputEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		OutputStream os = new FileOutputStream("C:/Users/PBL-14/hello.txt",true); // append ���
		String name, dep, pos;
	System.out.println("�� ���� ����Ͻðڽ��ϱ�?");
	int num = sc.nextInt(); sc.nextLine();
		for(int i=0; i<num; i++){
				System.out.println("�̸� ���� �μ��� �Է��ϼ���..");

				name = "����̸� : "+ sc.next()+ "\t"; dep = "����� ���� : "+ sc.next()+ "\t"; 
				pos = "����μ� : "+sc.next()+ "\t\n";

				os.write(name.getBytes()); 
				os.write(dep.getBytes());
				os.write(pos.getBytes());
	
			}
		os.close();
}
}
