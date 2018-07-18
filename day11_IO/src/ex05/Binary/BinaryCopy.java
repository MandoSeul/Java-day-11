package ex05.Binary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
		public static void main(String[] args) {
			File src = new File("C:/Windows/explorer.exe");//������ - �������
			File dist = new File("D:/javaapp/workspace/explorer.bin");//������ - ������ ��ġ
			int count;
			FileInputStream fin = null;
			FileOutputStream fos = null;
			BufferedInputStream bin = null;
			BufferedOutputStream bos = null;
			
			try {
				fin = new FileInputStream(src); // ���� �Է� ����Ʈ ��Ʈ�� ����
				fos = new FileOutputStream(dist);// ���� ��� ����Ʈ ��Ʈ�� ����
				bin = new BufferedInputStream(fin);//���� �Է½�Ʈ�� ����
				bos = new BufferedOutputStream(fos); // ������½�Ʈ�� ����
				
				while((count = bin.read())!=1){
					bos.write((char)count);
				}//end while
				
				System.out.println("���� ���� ����");
				bin.close(); 
				bos.close();
				fin.close();
				fos.close();
			} catch (Exception e) {
				System.out.println("���� ���� ���� �߻�~!~!~!");
			}
		}

}
