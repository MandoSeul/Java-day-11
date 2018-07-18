package ex04.FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInformation {
	public static void main(String[] args) throws IOException {
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		
		System.out.println("file name : ");
		System.in.read(fileName); // ����ó��
		strName = new String(fileName).trim(); // ������ �о ���� �̸� �޾ƿ�
		
		file = new File(strName);
		System.out.println("���� ��� : "+ file.getAbsolutePath());
		System.out.println("ǥ�� ��� : "+ file.getCanonicalPath());
		System.out.println("���������� : "+ new Date(file.lastModified()));
		System.out.println("���� ũ�� : "+ file.length());
		System.out.println("�б� �Ӽ� : "+ file.canRead());
		System.out.println("���� �Ӽ� : "+ file.canWrite());
		System.out.println("���� ��� : "+ file.getPath());
		System.out.println("���� �Ӽ� : "+ file.isHidden());
		
	}
}
