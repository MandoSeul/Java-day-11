package ex06.prac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.Vector;

public class StudentClass extends PersonClass {
	Scanner sc = new Scanner(System.in);
	Vector vec = new Vector();
	private String major = " ���� : ",uniage=" �й� : ", grade=" �г� : ", score=" ���� : ";
	String str, tep ="\r\n" ;
	int num=0;
	public StudentClass() throws FileNotFoundException  {
		OutputStream os = new FileOutputStream("C:/Users/PBL-14/person.txt",true);
		System.out.println("����� �л����� ����Դϱ�?");
		num = sc.nextInt(); sc.nextLine();
		for(int i=0; i<num; i++){
			System.out.println("�̸� ���� ���� �а� �й� �г� ������ �Է��ϼ��� : ");
			vec.add(name+sc.next()+age+sc.next()+man+sc.next()+major+sc.next()+uniage+sc.next()+grade+sc.next()+score+sc.next()+tep);
			try {
				os.write(((String) vec.get(i)).getBytes());
				System.out.println("���Ͽ� ��ϵǾ����ϴ�.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}
